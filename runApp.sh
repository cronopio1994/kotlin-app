#!/usr/bin/env bash

./gradlew clean test build
docker build -f Dockerfile -t local/kotlinapp
docker run -p 8080:8080 --name kotlinapp local/kotlinapp