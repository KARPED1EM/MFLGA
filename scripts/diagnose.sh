#!/bin/bash
# MFLGA Diagnostic Script - run once after reboot
echo "=============================="
echo " MFLGA Diagnostic Report"
echo "=============================="
echo ""

echo "[1] FL Service Status"
adb shell "su -c 'service list'" 2>&1 | grep "service_fl" && echo "  → FL is RUNNING" || echo "  → FL NOT running"
echo ""

echo "[2] System Server Hook (blacklist)"
adb shell "su -c 'cat /data/adb/lspd/log/modules_*.log'" 2>&1 | grep "MFLGA" | grep -E "system" | grep -v "detector\|lark" | tail -8
echo ""

echo "[3] setSafeApps Hook Status"
adb shell "su -c 'cat /data/adb/lspd/log/modules_*.log'" 2>&1 | grep "setSafeApps" | tail -3
echo ""

echo "[4] Built-in Blacklist Hook Status"
adb shell "su -c 'cat /data/adb/lspd/log/modules_*.log'" 2>&1 | grep "built-in" | tail -3
echo ""

echo "[5] Target App Hooks"
for app in "com.mflga.detector" "com.ss.android.lark"; do
    echo "  --- $app ---"
    adb shell "su -c 'cat /data/adb/lspd/log/modules_*.log'" 2>&1 | grep "$app" | grep "hooked OK\|FAIL" | tail -5
done
echo ""

echo "[6] Runtime Blacklist - lark check"
adb shell "su -c 'service call service_fl_ml 33'" 2>&1 | python3 -c "
import sys, re, struct
content = sys.stdin.read()
raw = bytearray()
for line in content.split('\n'):
    m = re.match(r'\s*0x[0-9a-f]+:\s+([0-9a-f ]+)', line)
    if m:
        for w in m.group(1).strip().split():
            if len(w)==8: raw += struct.pack('<I', int(w, 16))
if len(raw) < 8:
    print('  → Cannot read blacklist (FL not running?)'); sys.exit()
count = struct.unpack_from('<i', raw, 4)[0]
offset = 8; pkgs = []
for i in range(count):
    if offset+4 > len(raw): break
    sl = struct.unpack_from('<i', raw, offset)[0]; offset += 4
    if sl < 0 or sl > 500: break
    end = offset + sl*2
    if end > len(raw): break
    s = raw[offset:end].decode('utf-16-le', errors='replace')
    pkgs.append(s); offset = end + 2
    if offset % 4: offset += 4 - (offset % 4)
print(f'  Total entries: {len(pkgs)}')
if 'com.ss.android.lark' in pkgs:
    print('  ✗ com.ss.android.lark IS in blacklist (BLOCKED)')
else:
    print('  ✓ com.ss.android.lark NOT in blacklist (UNBLOCKED)')
" 2>&1
echo ""

echo "[7] /data/fl visibility"
adb shell "su -c 'ls -ld /data/fl 2>/dev/null && echo VISIBLE || echo HIDDEN'"
echo ""

echo "[8] KSU Module"
adb shell "su -c 'ls /data/adb/modules/mflga_fs_hide/service.sh 2>/dev/null && echo PRESENT || echo MISSING'"
echo ""

echo "=============================="
echo " Diagnosis complete"
echo "=============================="
