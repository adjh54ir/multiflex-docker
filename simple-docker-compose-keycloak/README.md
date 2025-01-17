## simple-docker-compose-jenkins

    ⭕️ dockerfile을 기반으로 KeyCloack 이미지를 다운받고 컨테이너를 구성하는 예시입니다.

<br/>

- 참고 Reference : [Docker Compose를 이용한 Keycloak 환경 구성 및 실행 방법](https://adjh54.tistory.com/414)

<br/>

### 실행 방법

```shell
# 프로젝트 접근
$ cd simple-docker-compose-keycloak

# docker 컨테이너 이미지 생성 & 컨테이너 실행
$ docker compose up -d

# docker compose 상태 확인
$ docker compose ps

# [필요시] 1. 실행 중인 컨테이너, 네트워크, 볼륨 모두 제거
$ docker compose down -v


# [필요시] 2. 이미지 제거 (선택사항)
$ docker rmi simple-keycloak postgres:16-alpine3.21
$ docker rmi simple-docker-compose-keycloak-keycloak:latest

# [필요시] 3. 컨테이너 이미지 생성 & 컨테이너 재실행]
$ docker compose up -d


```

<br/>
<br/>


