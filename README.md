# multiflex-docker

    > Dockerfile 기반으로 테스트를 위한 프로젝트입니다.

<br/>
<br/>

## 1. simple-nginx

    > dockerfile을 기반으로 간단한 Nginx를 설치하고 index.html에 접근해봅니다.

<br/>

- 참고 Reference : [Dockerfile 이해하고 Nginx 구성 및 실행하기](https://adjh54.tistory.com/414)

<br/>

### 실행 방법

    # docker 컨테이너 이미지 생성
    $ docker build -t nginx:simple-nginx .

    # docker 컨테이너 생성 및 실행
    $ docker run -d -p 8080:80 --name simple-nginx nginx:simple-nginx

<br/>
<br/>

## 2. simple-vault

    > dockerfile을 기반으로 간단한 Vault를 설치하고 수행합니다.

<br/>

- 참고 Reference : [Dockerfile로 Vault 구성 방법](https://adjh54.tistory.com/415)

<br/>

### 실행 방법

    # docker 컨테이너 이미지 생성
    $ docker build -t hashicorp/vault .

    # docker 컨테이너 생성 및 실행
    $ docker run -d --cap-add IPC_LOCK --name vault -p 8200:8200 hashicorp/vault

<br/>
<br/>

## 3. simple-react-app

    > dockerfile을 기반으로 간단한 React App을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 React 배포 환경 구성 및 실행하기](https://adjh54.tistory.com/417)

<br/>

    # 컨테이너 이미지 생성
    $ docker build . -t simple-react-app .

    # 컨테이너 생성 및 실행
    $ docker run -d --name simple-react-app -p 3000:3000 simple-react-app

<br/>
<br/>

## 4. simple-spring-boot

    > dockerfile을 기반으로 간단한 Spring Boot App을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 Spring Boot App 배포 환경 구성 및 실행하기](https://adjh54.tistory.com/420)

<br />

    # 컨테이너 이미지 생성
    $ docker build -t simple-spring-boot-app .

    # 컨테이너 생성 및 실행
    $ docker run -d --name simple-spring-boot-app -p 8080:8080 simple-spring-boot-app

<br/>
<br/>

## 5. simple-redis

    > dockerfile을 기반으로 간단한 Redis을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 Redis 환경 구성 및 실행방법](https://adjh54.tistory.com/449)

<br/>

    # 프로젝트 접근
    $ cd simple-redis

    # 컨테이너 이미지 생성
    $ docker build -t simple-spring-boot-app .

    # 컨테이너 생성 및 실행
    $ docker run -d --name simple-spring-boot-app -p 8080:8080 simple-spring-boot-app

    # docker 컨테이너 아이디를 확인합니다
    $ docker ps

    # redis-cli를 접근합니다.
    $ docker exec -it <CONTAINER ID> redis-cli

<br/>
<br/>

## 5. simple-rabbitmq

    > dockerfile을 기반으로 간단한 RabbitMQ을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 RabbitMQ 환경 구성 및 실행방법](https://adjh54.tistory.com/496)

<br/>

    # 프로젝트 접근
    $ cd simple-rabbitmq

    # 컨테이너 이미지 생성
    $ docker build -t simple-rabbitmq .

    # 컨테이너 생성 및 실행
    $ docker run -d --name simple-rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq

<br/>
<br/>

## 6. simple-docker-compose

    > docker-compose를 이용한 React App, Spring Boot App 일괄 배포하기

<br/>

- 참고 Reference : [Docker 이해하기 -4 : Docker Compose 이해하고 구성하기](https://adjh54.tistory.com/503)

<br/>

    # 프로젝트 접근
    $ cd simple-docker-compose

    # docker compose 실행
    $ docker-compose up

    # docker compose 상태 확인
    $ docker-compose ps

    # docker compose 삭제
    $ docker-compose down
