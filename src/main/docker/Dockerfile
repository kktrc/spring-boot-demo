FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD spring-boot-demo.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "nohup", "java $JAVA_OPTS -jar /app.jar > /dev/null 2 >&1 &" ]