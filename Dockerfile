FROM java:8
MAINTAINER <hz920120@gmail.com>Cesc
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY *.jar /docker-compose-springboot-mysql-redis.jar
# springboot http 端口 -p 8899:8899
EXPOSE 8899
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-compose-springboot-mysql-redis.jar"]