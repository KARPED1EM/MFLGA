#!/system/bin/sh
# Wait for FakeLocation to finish initializing
sleep 30
# Lock down /data/fl so apps can't detect it
chmod 700 /data/fl 2>/dev/null
chmod 700 /data/fl/system_dex 2>/dev/null
chmod 700 /data/fl/zygote_dex 2>/dev/null
# Also watch and re-lock every 60s in case FL resets it
while true; do
    sleep 60
    chmod 700 /data/fl 2>/dev/null
done &
