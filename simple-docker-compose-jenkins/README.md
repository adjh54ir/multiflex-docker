## simple-jenkins

    ⭕️ dockerfile을 기반으로 간단한 Jenkins Dokcer Image를 다운받고 컨테이너를 실행시킵니다.

<br/>

- 참고 Reference : [Dockerfile 이해하고 Nginx 구성 및 실행하기](https://adjh54.tistory.com/414)

<br/>

### 실행 방법

```shell

# 프로젝트 접근
$ cd simple-docker-compose-jenkins

# docker 컨테이너 이미지 생성
$ docker build -t simple-jenkins .

# docker 컨테이너 생성 및 실행
$ docker run -d \
  --name jenkins \
  -p 8080:8080 \
  -p 50000:50000 \
  -v jenkins_home:/var/jenkins_home \
  -v /var/run/docker.sock:/var/run/docker.sock \
  simple-jenkins
```

<br/>
<br/>
