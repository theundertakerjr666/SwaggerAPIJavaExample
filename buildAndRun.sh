#!/bin/sh
mvn clean package && docker build -t com.employee/SwaggerAPIJavaExample .
docker rm -f SwaggerAPIJavaExample || true && docker run -d -p 8080:8080 -p 4848:4848 --name SwaggerAPIJavaExample com.employee/SwaggerAPIJavaExample 
