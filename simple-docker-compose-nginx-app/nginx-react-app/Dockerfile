# 빌드 스테이지 
FROM node:18-alpine AS builder

# Set the working directory in the container
WORKDIR /src

COPY package*.json ./

# RUN yarn
# or
RUN npm install

COPY . .

RUN npm run build


# 실행 스테이지
FROM nginx:stable-alpine3.19-perl

RUN rm /etc/nginx/conf.d/default.conf
RUN rm -rf /etc/nginx/conf.d/*

COPY ./config/nginx.conf /etc/nginx/conf.d/nginx.conf

COPY ./build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]