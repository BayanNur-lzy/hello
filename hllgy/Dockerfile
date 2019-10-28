# 基础镜像使用java
FROM artifact-registry.mercedes-benz.com.cn/baselibrary/openjdk:11-jdk-slim
# 作者
MAINTAINER bylz
# 将jar包添加到容器中
ADD ./hllgy/target/hello-0.0.1-SNAPSHOT.jar /app/hello-0.0.1-SNAPSHOT.jar
RUN chmod -R 777 /app
# 修改这个jar包的访问时间和修改时间为当前时间
RUN bash -c 'touch /app/hello-0.0.1-SNAPSHOT.jar'
USER 1000
ENTRYPOINT ["java","-jar","/app/hello-0.0.1-SNAPSHOT.jar"]
