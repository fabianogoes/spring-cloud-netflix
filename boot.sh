#!/bin/bash

clear
rm nohup.out

nohup java -jar discovery/target/discovery-0.0.1-SNAPSHOT.jar&

nohup java -DPORT=8081 -jar service-person/target/service-person-0.0.1-SNAPSHOT.jar&
nohup java -DPORT=8082 -jar service-person/target/service-person-0.0.1-SNAPSHOT.jar&

nohup java -jar admin/target/admin-0.0.1-SNAPSHOT.jar&

tail -f nohup.out

# Kill Applicaions
# netstat -anp | grep java
# sudo kill -9 PID

