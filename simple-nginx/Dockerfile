# Nginx 이미지를 기반으로 Docker 이미지를 생성합니다.
FROM nginx

# 새 Nginx 설정 파일을 Docker 이미지에 복사합니다.
COPY ./config/nginx.conf /etc/nginx/conf.d/nginx.conf

# index.html 파일을 Docker 이미지의 /usr/share/nginx/html 디렉토리로 복사합니다.
COPY ./html/index.html /usr/share/nginx/html/index.html

ENTRYPOINT ["nginx", "-g", "daemon off;"]