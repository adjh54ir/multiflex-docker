## simple-docker-compose-apache-kafka

    ⭕️ docker-compose를 이용하여 Apache Kafka 배포하기

<br/>

- 참고 Reference

  - [Docker Compose를 이용한 Apache Kafka 환경 구성 방법 -1 : KRaft, Kafka-ui](https://adjh54.tistory.com/637)

<br/>

### 실행 방법

<br/>

```shell
# 프로젝트 접근
$ cd simple-apache-kafka

# docker compose 실행
$ docker compose up -d

# docker compose 상태 확인
$ docker compose ps

# 컨테이너 접속
$ docker exec -it [kafka-container-id] bash

# 토픽 생성
$ kafka-topics --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

# 토픽 목록 확인
$ kafka-topics --list --bootstrap-server localhost:9092

# 필요 시 : 실행중인 docker compose 삭제
$ docker compose down
```
