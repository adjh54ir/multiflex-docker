# 기본 이미지를 설정합니다. 여기서는 RabbitMQ 이미지를 선택했습니다.
FROM rabbitmq:3.13-management

# RabbitMQ 설정 파일을 복사합니다.
COPY ./config/rabbitmq.conf /etc/rabbitmq

# RabbitMQ 플러그인을 활성화합니다.
RUN rabbitmq-plugins enable --offline rabbitmq_management
# or 플러그인 추가 가능
# RUN rabbitmq-plugins enable --offline rabbitmq_mqtt rabbitmq_federation_management rabbitmq_stomp

# RabbitMQ 관리자 계정, 비밀번호를 지정합니다.
ENV RABBITMQ_DEFAULT_USER admin
ENV RABBITMQ_DEFAULT_PASS 1234

# 컨테이너가 시작될 때 실행될 명령을 설정합니다.
CMD ["rabbitmq-server"]