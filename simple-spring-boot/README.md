## simple-spring-boot

    ⭕️ dockerfile을 기반으로 간단한 Spring Boot App을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 Spring Boot App 배포 환경 구성 및 실행하기](https://adjh54.tistory.com/420)

<br />

### 실행 방법

```shell
# 컨테이너 이미지 생성
$ docker build -t simple-spring-boot-app .

# 컨테이너 생성 및 실행
$ docker run -d --name simple-spring-boot-app -p 8080:8080 simple-spring-boot-app
```

<br/>
<br/>
