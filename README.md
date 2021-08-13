# flow-control2-by-nginx

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
```

*deploy*

```sh
java -jar app/build/libs/app-0.0.1-SNAPSHOT.jar
```

## 参考

- https://spring.pleiades.io/guides/gs/spring-boot-docker/
