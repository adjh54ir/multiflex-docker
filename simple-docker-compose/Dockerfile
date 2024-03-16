FROM node:18-alpine

WORKDIR /src

COPY ../simple-react-app/package.json .

RUN yarn
# or
# RUN npm install 

COPY . .

EXPOSE 3000

CMD [ "yarn", "start" ]
# or
# CMD [ "npm", "start" ]