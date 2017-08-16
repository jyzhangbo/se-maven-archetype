#!/bin/bash
cd `dirname $0`
BIN_DIR=`pwd`
cd ..
DEPLOY_DIR=`pwd`

SERVER_NAME="se-api"

PIDS=`ps ef | grep "java" | grep -v grep | awk '{print $1}'`
if [ -z "$PIDS" ]; then
    echo "ERROR: The $SERVER_NAME does not started!"
    exit 1
fi

echo -e "Stopping the $SERVER_NAME ...\c"
for PID in $PIDS ; do
        kill -9 $PID > /dev/null 2>&1
done

COUNT=0
while [ $COUNT -lt 1 ]; do
    echo -e ".\c"
    sleep 1
    COUNT=1
    for PID in $PIDS ; do
                ps -o pid= |grep $PID
                PID_EXIST=$?
                if [ "$PID_EXIST" = 0 ]; then
                        COUNT=0
                        break
                fi
        done
done
echo "OK!"
echo "PID: $PIDS"
rm -f $BIN_DIR/service.pid
