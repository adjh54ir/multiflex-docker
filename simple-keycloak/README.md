## simple-keycloak

    ⭕️ dockerfile을 기반으로 간단한 Keycloak을 설치하고 실행해봅니다.

<br/>

- 참고 Reference : [Docker Compose를 이용한 Keycloak 환경 구성 및 실행 방법]
(https://adjh54.tistory.com/414)

<br/>

### 실행 방법

```shell
# docker 컨테이너 이미지 생성
$ docker build -t simple-keycloak .

# docker 컨테이너 생성 및 실행
$ docker run -d -p 9001:8080 --name simple-keycloak simple-keycloak

# [필요 시] docker 컨테이너 중지
$ docker stop simple-keycloak

# [필요 시] docker 컨테이너 삭제 
$ docker rm simple-keycloak

```

<br/>
<br/>
