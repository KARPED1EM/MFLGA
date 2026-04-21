# MFLGA

**Make Fake Location Great Again**

An Xposed/LSPosed module that removes [FakeLocation](https://fakeloc.cc/app)'s built-in blacklist and hides all detection vectors from target apps.

## How It Works

MFLGA operates in two phases:

### Phase 1: System Server

Intercepts FakeLocation's injected ClassLoader inside `system_server` and neutralizes its blacklist mechanism:

- Hooks `setSafeApps()` — replaces all real package names with dummy placeholders
- Hooks the built-in blacklist getter — same treatment

After this, FL's blacklist is effectively empty: no app gets blocked.

### Phase 2: Target Apps

Hooks multiple detection vectors inside target apps so they cannot discover FL is running:

| Vector | Hook | Effect |
|--------|------|--------|
| **Binder services** | `ServiceManager.getService()` and 3 others | FL services (`service_fl_*`, `service_mock_location`) return `null` |
| **Service listing** | `ServiceManager.listServices()` | FL services filtered from results |
| **Mock location flag** | `Location.isMock()`, `isFromMockProvider()` | Always returns `false` |
| **Package visibility** | `PackageManager.getPackageInfo()` | Throws `NameNotFoundException` for FL packages |
| **Filesystem** | `File.exists()`, `File.isDirectory()` | Returns `false` for `/data/fl/*` paths |
| **Low-level stat** | `Os.stat()`, `Os.lstat()` | Throws `ENOENT` for `/data/fl/*` paths |

## Project Structure

```
xposed/          Main Xposed hook module
detector/        Companion app — tests all detection vectors with live UI
ksu/             KernelSU module — locks /data/fl permissions as extra layer
scripts/         Utility tools (diagnose.sh, RemoveLark.java)
research/        Reverse engineering analysis of FakeLocation v1.5.0
```

## Compatibility

- **Framework**: LSPosed v93+ (Xposed API 93)
- **Android**: 7.0+ (API 24)
- **Target**: FakeLocation v1.5.0 (build 1700)

## Building

This project uses manual compilation (no Gradle). You need:

- JDK 11+
- Android build tools (`aapt2`, `android.jar`) — place in `build_tools/`
- The Xposed stubs are included in `xposed/stubs/`

## Scope

The module works for **any app** you enable in LSPosed's scope UI — no code changes needed. Just check the app and reboot.

`android` (system_server) must always be enabled for blacklist neutralization.

Recommended scope is pre-configured in `xposed/res/values/arrays.xml`.

## License

[MIT](LICENSE)
