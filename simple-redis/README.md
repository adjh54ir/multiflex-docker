## simple-redis

    ⭕️ dockerfile을 기반으로 간단한 Redis을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 Redis 환경 구성 및 실행방법](https://adjh54.tistory.com/449)

<br/>

### 실행 방법

```shell
# 프로젝트 접근
$ cd simple-redis

# 컨테이너 이미지 생성
$  docker build . -t simple-redis

# 컨테이너 생성 및 실행
$ docker run -d --name simple-redis -p 6379:6379 simple-redis

# docker 컨테이너 아이디를 확인합니다
$ docker ps

# redis-cli를 접근합니다.
$ docker exec -it <CONTAINER ID> redis-cli
```

<br/>
<br/>
