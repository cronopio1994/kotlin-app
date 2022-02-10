#!/usr/bin/env bash

./gradlew clean test build
docker build -f Dockerfile -t local/kotlinapp .

docker-compose up