FROM hashicorp/vault

# 호스트의 폴더를 컨테이너에 마운트
COPY ./config /vault/config
COPY ./file /vault/file
COPY ./logs /vault/logs

# 포트 설정
EXPOSE 8200

# 컨테이너 실행 명령
CMD ["vault", "server", "-config=/vault/config"]
