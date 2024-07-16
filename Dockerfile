FROM gradle:jdk17-alpine as build-stage
WORKDIR /paolu
COPY . .

RUN gradle :bootJar

FROM openjdk:17-alpine

COPY --from=build-stage /paolu/build/libs/xpanel-0.0.1-SNAPSHOT.jar xpanel.jar

## 设置 TZ 时区
ENV TZ=Asia/Shanghai
## 设置 JAVA_OPTS 环境变量，可通过 docker run -e "JAVA_OPTS=" 进行覆盖
ENV JAVA_OPTS="-Xms512m -Xmx512m"

## 应用参数
ENV ARGS="--server.port=8080 --spring.profiles.active=prod"

## 暴露后端项目的 8080 端口
EXPOSE 8080

## 启动后端项目
CMD java ${JAVA_OPTS} -jar xpanel.jar $ARGS
