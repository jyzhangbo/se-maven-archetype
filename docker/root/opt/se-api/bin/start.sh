#!/bin/bash
cd `dirname $0`
BIN_DIR=`pwd`
cd ..
DEPLOY_DIR=`pwd`

SERVER_NAME="se-api"
SERVER_PORT=8080

PIDS=`ps ef | grep "java" | grep -v grep | awk '{print $1}'`
if [ -n "$PIDS" ]; then
    echo "ERROR: The $SERVER_NAME already started!"
    echo "PID: $PIDS"
    exit 1
fi

if [ -n "$SERVER_PORT" ]; then
	SERVER_PORT_COUNT=`netstat -tln | grep $SERVER_PORT | wc -l`
	if [ $SERVER_PORT_COUNT -gt 0 ]; then
		echo "ERROR: The $SERVER_NAME port $SERVER_PORT already used!"
		exit 1
	fi
fi

echo "10.39.0.152 d1" >> /etc/hosts
echo "10.39.0.153 d2" >> /etc/hosts
echo "10.39.0.154 d3" >> /etc/hosts
echo "10.39.0.155 d4" >> /etc/hosts

LOGS_DIR="/data/logs"

if [ ! -d $LOGS_DIR ]; then
	mkdir -p $LOGS_DIR
fi
STDOUT_FILE=$LOGS_DIR/service.log

JAVA_OPTS=" -Djava.security.egd=file:/dev/./urandom -Duser.timezone=\"GMT+8\" -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true"

JAVA_MEM_OPTS=" -server -Xmx${XMX:-2048m} -Xms${XMS:-1024m} -Xss256k -XX:+DisableExplicitGC -XX:+UseConcMarkSweepGC -XX:+CMSParallelRemarkEnabled -XX:+UseCMSCompactAtFullCollection -XX:LargePageSizeInBytes=${LargePageSize:-4m} -XX:+UseFastAccessorMethods -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=70 "


echo -e "Starting the $SERVER_NAME ...\c"
nohup java $JAVA_OPTS $JAVA_MEM_OPTS -jar -Dspring.profiles.active=pro ./bin/se-api-1.0-SNAPSHOT.jar > $STDOUT_FILE 2>&1 &

COUNT=0
while [ $COUNT -lt 1 ]; do    
    echo -e ".\c"
    sleep 1 
   	COUNT=`ps ef | grep "java"  | grep -v grep | awk '{print $1}' | wc -l`
	if [ $COUNT -gt 0 ]; then
		break
	fi
done
echo "OK!"
PIDS=`ps ef | grep "java"  | grep -v grep | awk '{print $1}'`
echo "PID: $PIDS"
echo "STDOUT: $STDOUT_FILE"

echo $PIDS > $BIN_DIR/service.pid
