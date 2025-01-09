## simple-vault

    ⭕️ dockerfile을 기반으로 간단한 Vault를 설치하고 수행합니다.

<br/>

- 참고 Reference : [Dockerfile로 Vault 구성 방법](https://adjh54.tistory.com/415)

<br/>


### 실행 방법

```shell
# docker 컨테이너 이미지 생성
$ docker build -t hashicorp/vault .

# docker 컨테이너 생성 및 실행
$ docker run -d --cap-add IPC_LOCK --name vault -p 8200:8200 hashicorp/vault
```
