#!/usr/bin/env bash

docker stop spring-boot-demo

docker rm spring-boot-demo

docker rmi panda/spring-boot-demo

cd ..

mvn clean package -Dmaven.test.skip=true docker:build

docker run -d --name=spring-boot-demo -p 8081:8081 -t panda/spring-boot-demo
