# multiflex-docker
    
    Docker 테스트를 위한 프로젝트입니다.

* 참고 Reference : [Dockfile 이해하고 Nginx 구성 및 실행하기](https://adjh54.tistory.com/414)


<br/>



## 1. simple-nginx  

    > dockerfile을 기반으로 간단한 Nginx를 설치하고 index.html에 접근해봅니다.

<br/>

<실행 방법>

    # docker 컨테이너 이미지 생성
    $ docker build -t nginx:simple-nginx .

    # docker 컨테이너 생성 및 실행
    $ docker run -d -p 8080:80 --name simple-nginx nginx:simple-nginx

<br>


## 2. simple-vault

    > dockerfile을 기반으로 간단한 Vault를 설치하고 수행합니다.

<br/>

<실행 방법>

    # docker 컨테이너 이미지 생성
    $ docker build -t hashicorp/vault .

    # docker 컨테이너 생성 및 실행
    $ docker run -d --cap-add IPC_LOCK --name vault -p 8200:8200 hashicorp/vault

