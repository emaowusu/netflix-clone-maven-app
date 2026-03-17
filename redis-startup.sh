#!/bin/bash

echo "Starting Redis..."
redis-server --daemonize yes

echo "Starting Spring Boot app..."
mvn spring-boot:run &

echo "Waiting for app to start..."
sleep 6

echo "Opening browser..."
xdg-open http://localhost:8080 2>/dev/null || open http://localhost:8080
