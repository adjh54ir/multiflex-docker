## simple-rabbitmq

    ⭕️ dockerfile을 기반으로 간단한 RabbitMQ을 생성하고 실행합니다.

<br/>

- 참고 Reference : [Dockerfile을 이용한 RabbitMQ 환경 구성 및 실행방법](https://adjh54.tistory.com/496)

<br/>

### 실행 방법

```shell
# 프로젝트 접근
$ cd simple-rabbitmq

# 컨테이너 이미지 생성
$ docker build -t simple-rabbitmq .

# 컨테이너 생성 및 실행
$ docker run -d --name simple-rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq
```

<br/>
<br/>
