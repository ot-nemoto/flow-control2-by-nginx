# flow-control2-by-nginx

## 概要

- nginxに流量制限を設定し検証

|Path|Method|流量制限|HTTPステータス|
|--|--|--|--|
|/|GET-|-|
|/1.html|GET|10req/s(all)|429|
|/2.html|GET|30req/s(all)|503|
|/3.html|POST|-|-|
|/4.html|POST|10req/s(all)|429|
|/5.html|POST|10req/s($uri)|429|
|/6.html|POST|30req/s($uri)|429|

- appはGradleのデモアプリ
- appは8081で起動
- nginxは8080で起動

## 環境構築

```sh
java -version
  # openjdk version "11.0.12" 2021-07-20 LTS
  # OpenJDK Runtime Environment Corretto-11.0.12.7.1 (build 11.0.12+7-LTS)
  # OpenJDK 64-Bit Server VM Corretto-11.0.12.7.1 (build 11.0.12+7-LTS, mixed mode)
```

*build*

```sh
./app/gradlew -b app/build.gradle build
#java -jar app/build/libs/app-0.0.1-SNAPSHOT.jar
docker-compose build
```

*deploy*

```sh
docker-compose up -d
```

## 参考

- https://spring.pleiades.io/guides/gs/spring-boot-docker/
