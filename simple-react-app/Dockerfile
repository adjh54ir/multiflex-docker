FROM node:18

WORKDIR src/

COPY package.json .

RUN yarn
# or
# RUN npm install 

COPY . .

EXPOSE 3000

# 런타임을 정의합니다.
CMD [ "yarn", "start" ]
# or
# CMD [ "npm", "start" ]