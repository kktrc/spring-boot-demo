cd ..

mvn clean package -Dmaven.test.skip=true docker:build

docker run -d --name=spring-boot-demo -p 7070:7070 -t panda/spring-boot-demo