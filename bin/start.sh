cd ..

mvn clean package -Dmaven.test.skip=true docker:build

docker run -d --name=spring-boot-demo -p 8081:8081 -t panda/spring-boot-demo