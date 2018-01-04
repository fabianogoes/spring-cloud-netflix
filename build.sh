#!/bin/bash

clear

cd admin/
rm -rf target
mvn clean package

cd ../discovery/
rm -rf target
mvn clean package

cd ../service-person/
rm -rf target
mvn clean package

cd ..
