# MFLGA

**Make Fake Location Great Again**

A comprehensive reverse-engineering and countermeasure project for [FakeLocation](https://fakeloc.cc), the popular Android location spoofing tool. MFLGA removes FakeLocation's built-in app blacklist and makes it completely undetectable to target applications.

## Background

FakeLocation is a powerful location spoofing tool for rooted Android devices, but it ships with two significant limitations:

1. **App Blacklist** — FL maintains a blacklist of ~260 app package names (ride-hailing drivers, enterprise apps, fitness trackers, etc.) that it refuses to mock. This list is compiled from both a hardcoded built-in list (207 entries, XOR-encrypted in the injection DEX) and a remote list fetched from FL's servers at runtime.

2. **Detection Surface** — FL registers several discoverable system services (`service_fl_ml`, `service_fl_mw`, `service_fl_na`, `service_fl_xp`), leaves filesystem artifacts at `/data/fl/`, and doesn't properly clear the `isMock` flag on `Location` objects. Any app can detect FL is running through these vectors.

MFLGA eliminates both problems through a combination of Xposed hooks, KernelSU filesystem hardening, and deep understanding of FL's internal architecture gained through full reverse engineering of its injection mechanism.

## Architecture

MFLGA consists of three components:

### 1. Xposed Module (`com.mflga.xposed`)

Operates at two levels simultaneously:

#### System Server Layer (Blacklist Neutralization)

Uses the same technique as [fflbl](https://bitbucket.org/tonyha7/fflbl.git) (updated for FL v1.5.0): hooks `ClassLoader.loadClass` in `system_server` to detect FL's injection ClassLoader (identified by `/data/fl/` in the loader path), then hooks two critical methods in the injection code:

| Original Class | Method | Purpose |
|---------------|--------|---------|
| `ࢡ.ފ` (C0041) | `setSafeApps(List)` | Receives merged blacklist from FL app; we replace all real package names with dummy placeholders |
| `ࢡ.ؠ` (C0011) | `Ϳ()` | Returns built-in blacklist; same treatment |

The replacement maintains list size ≥100 (FL's threshold for activation) but uses dummy names (`x.placeholder.N`) that match no real app.

**Note**: Hooks run in a separate thread to avoid blocking ClassLoader operations (critical lesson learned from the original fflbl approach).

#### Target App Layer (Detection Hiding)

Hooks are applied to any app enabled in LSPosed's scope UI — no hardcoded target list. The module automatically skips system processes (UID < 10000) and FL itself:

| Detection Vector | Hook Point | Technique |
|-----------------|------------|-----------|
| Binder services | `ServiceManager.getService/checkService/rawGetService/waitForService` | Returns `null` for `service_fl_*` and `service_mock_location` |
| Service enumeration | `ServiceManager.listServices()` | Filters FL services from returned array |
| Mock location flag | `Location.isMock()`, `Location.isFromMockProvider()` | Always returns `false` |
| Package detection | `PackageManager.getPackageInfo()` | Throws `NameNotFoundException` for FL package names |
| Filesystem (Java) | `File.exists()`, `File.isDirectory()` | Returns `false` for `/data/fl/*` paths |
| Filesystem (native) | `Os.stat()`, `Os.lstat()` | Throws `ErrnoException(ENOENT)` for `/data/fl/*` paths |

### 2. KernelSU Module (`mflga_fs_hide`)

Provides OS-level filesystem hardening as a defense-in-depth layer:

- Waits 15 seconds after boot (allowing FL to initialize)
- Renames `/data/fl/` to a randomized hidden path
- Sets restrictive permissions (chmod 700)

This catches detection methods that bypass Java-level hooks (direct native `stat64` syscalls via JNI).

### 3. Detector App (`com.mflga.detector`)

A standalone verification tool that tests all known detection vectors in real-time:

- GPS coordinates with reverse geocoding
- `Location.isMock()` / `isFromMockProvider()` status
- All FL service existence checks
- FL package installation checks  
- `/data/fl/` filesystem checks
- Root detection (su binary, KSU/Magisk paths)
- Xposed/LSPosed framework detection
- Process injection detection (`/proc/self/maps`, `LD_PRELOAD`)
- System settings checks (`ALLOW_MOCK_LOCATION`)

Auto-refreshes every 2 seconds with color-coded results (green = hidden, red = exposed).

## Reverse Engineering Findings

The research phase produced a complete understanding of FL v1.5.0's architecture:

### Injection Mechanism

FL injects a DEX file (disguised as `/data/fl/2da3c574.s`, packaged as a JAR) into `system_server` at boot. This injection:

- Hooks `LocationManagerService` to intercept all location delivery
- Hooks `WifiServiceImpl` to spoof WiFi scan results
- Hooks `TelephonyRegistry` to spoof cell tower data
- Registers 4 binder services for IPC with the FL app

### Obfuscation

All class and method names use Unicode characters from Arabic, Thaana, and Cyrillic scripts (e.g., `ࢡ.ފ`, `ؠ`, `Ϳ`). String constants (including the entire blacklist) are XOR-encrypted with an 8-byte key. The FL app itself is protected by 360 加固 (Qihoo 360 packer).

### Blacklist Format

The "safe apps" list supports per-mode filtering using `|` separators:

- `com.example.app` — blocked for all mock modes
- `a|com.example.app` — blocked only for location mock mode
- `e|com.example.app` — blocked only for cell tower mock mode

The wildcard `*` blocks all apps and is activated when the list has fewer than 100 entries (a tamper-detection mechanism).

### Key Files

| File | Size | Content |
|------|------|---------|
| `2da3c574.s` | ~106KB | Injection DEX (JAR format) |
| `1fb32ad6.s` | ~47KB | Native library (ARM64 ELF) |
| `5bcd21a5.s` | ~15KB | Native library (ARM32 ELF) |
| `2bc5ad15.s` | ~26KB | Native library (ARM64 ELF) |

## Setup

### Prerequisites

- Rooted Android device (KernelSU or Magisk)
- LSPosed v93+ (Zygisk mode)
- FakeLocation v1.5.0

### Installation

1. Install the Xposed module APK (`mflga-signed.apk`)
2. Enable it in LSPosed Manager
3. Configure scope:
   - **Required**: `android` (System Framework) — for blacklist neutralization
   - **Optional**: Any app you want to hide FL from — just check it in the scope list
4. (Optional) Install the KSU module for filesystem-level hiding
5. (Optional) Install MFLGA Detector to verify everything works
6. Reboot

### Verification

After reboot, open MFLGA Detector. All indicators should show green. Start FakeLocation, set a mock location, and verify indicators remain green.

## Building from Source

No Gradle or Android Studio required. Manual toolchain:

```bash
# Prerequisites: JDK 11+, place these in build_tools/
#   aapt2, r8.jar, apksig.jar, framework-res.apk, debug.keystore

# Compile
cd xposed
javac --release 11 -d build/classes -cp stubs \
    $(find stubs -name "*.java") \
    src/com/mflga/xposed/MainHook.java

# Only include our classes (NOT stubs — LSPosed rejects modules with Xposed API compiled in)
java -cp ../build_tools/r8.jar com.android.tools.r8.D8 \
    --min-api 24 --output build/ \
    $(find build/classes/com/mflga -name "*.class")

# Package
aapt2 compile --dir res -o build/res.zip
aapt2 link --manifest AndroidManifest.xml \
    -I ../build_tools/framework-res.apk \
    -o build/mflga.apk \
    --min-sdk-version 24 --target-sdk-version 34 \
    build/res.zip

# Add DEX and xposed_init
# (use zipfile to append classes.dex and assets/xposed_init)

# Sign with v2
java -cp "apksig.jar;." SignApk keystore.jks build/mflga.apk build/mflga-signed.apk
```

**Critical**: Only feed `com/mflga/**/*.class` to d8, never the stubs. LSPosed will refuse to load any module that contains `de.robv.android.xposed.*` class definitions.

## Project Structure

```
MFLGA/
├── xposed/              Xposed hook module
│   ├── src/             Module source (MainHook.java)
│   ├── stubs/           Compilation stubs (Xposed API + Android framework)
│   ├── res/             Android resources (recommended scope list)
│   ├── assets/          xposed_init entry point
│   └── AndroidManifest.xml
├── detector/            Detection verification app
│   ├── src/             DetectorActivity.java
│   └── stubs/           Android API stubs
├── ksu/                 KernelSU filesystem hide module
├── research/            Reverse engineering output
│   ├── decompiled/      Full jadx decompilation of FL injection DEX
│   └── blacklist.txt    Decoded built-in blacklist (207 entries)
├── scripts/             Diagnostic and build utilities
└── build_tools/         Compilation toolchain (gitignored)
```

## Compatibility Notes

- **FakeLocation version**: Developed against v1.5.0 (build 1700). The obfuscated class names (`ࢡ.ފ`, `ࢡ.ؠ`, method `Ϳ`) are version-specific and will need updating when FL releases new versions.
- **Android**: Tested on Android 16 (OnePlus Ace 3 Pro). Should work on Android 7.0+.
- **Root**: Tested with KernelSU. Magisk should also work.

## Credits

- [fflbl](https://bitbucket.org/tonyha7/fflbl.git) by tonyha7 — original FakeLocation blacklist bypass concept (for older FL versions)
- [tonyha7's blog post](https://www.tonyha7.com/2024/12/07/FakeLoc-2/) — initial research reference

## License

[MIT](LICENSE)
