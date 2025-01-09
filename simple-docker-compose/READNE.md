## simple-docker-compose

    ⭕️ docker-compose를 이용한 React App, Spring Boot App 일괄 배포하기

<br/>

- 참고 Reference
  - [Docker 이해하기 -4 : Docker Compose 이해하고 구성하기](https://adjh54.tistory.com/503)

<br/>

### 실행 방법

```shell
# 프로젝트 접근
$ cd simple-docker-compose

# docker compose 실행
$ docker-compose up

# docker compose 상태 확인
$ docker-compose ps

# docker compose 삭제
$ docker-compose down
```

## 4. simple-spring-boot

    > dockerfile을 기반으로 간단한 Spring Boot App을 생성하고 실행합니다.

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
