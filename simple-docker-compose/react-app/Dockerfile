FROM node:18-alpine AS build

# Set the working directory in the container
WORKDIR /src

COPY package*.json ./

RUN yarn
# or
# RUN npm install

COPY . .

EXPOSE 3000

CMD [ "yarn", "start" ]
# or
# CMD [ "npm", "start" ]
