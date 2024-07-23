FROM node:20 as BUILDER

WORKDIR /app

COPY package.json .
COPY yarn.lock .

RUN yarn install

COPY . .

RUN yarn build


FROM node:20 as RUNNER

WORKDIR /app

COPY package.json .
COPY yarn.lock .

RUN yarn install

COPY --from=BUILDER /app/build/src src

CMD [ "yarn", "deploy" ]





