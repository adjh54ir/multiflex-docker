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

## 3. simple-spring-boot

    > dockerfile을 기반으로 간단한 Spring Boot App을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 Spring Boot App 배포 환경 구성 및 실행하기](https://adjh54.tistory.com/420)

<br/>


    # 컨테이너 이미지 생성
    $ docker build -t simple-spring-boot-app .

    # 컨테이너 생성 및 실행
    $ docker run -d --name simple-spring-boot-app -p 8080:8080 simple-spring-boot-app

