## simple-docker-compose-rabbitmq-cluster

    ⭕️ docker-compose를 이용하여 RabbitMQ 클러스터링 배포하기

<br/>

- 참고 Reference : [Docker Compose를 이용한 RabbitMQ 노드 클러스터링 구성하기](https://adjh54.tistory.com/517)

<br/>

### 실행 방법

```shell
# 프로젝트 접근
$ cd simple-docker-compose-rabbitmq-cluster

# docker compose 실행
$ docker compose up

# docker compose 상태 확인
$ docker compose ps
```

<br/>

### 클러스터링 구성

<br/>

```shell
# 1. rabbitmq-1을 기준으로 rabbitmq-2, rabbitmq-3 앱을 중지(stop_app), 앱을 초기화(reset)를 수행합니다.
# 2. rabbitmq-1에 클러스터로 rabbitmq-2, rabbitmq-3을 추가합니다(join_cluster)
# 3. rabbitmq-2, rabbitmq-3을 실행합니다(start_app)

docker exec -it rabbitmq-2 rabbitmqctl stop_app
docker exec -it rabbitmq-2 rabbitmqctl reset
docker exec -it rabbitmq-2 rabbitmqctl join_cluster rabbit@rabbitmq-1
docker exec -it rabbitmq-2 rabbitmqctl start_app

docker exec -it rabbitmq-3 rabbitmqctl stop_app
docker exec -it rabbitmq-3 rabbitmqctl reset
docker exec -it rabbitmq-3 rabbitmqctl join_cluster rabbit@rabbitmq-1
docker exec -it rabbitmq-3 rabbitmqctl start_app
```

<br/>
