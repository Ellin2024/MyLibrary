FROM eclipse-temurin:21-jdk
WORKDIR /app
LABEL maintainer="javaguides.net"
ADD target/Mylibrary-v1.jar Mylibrary-v1.jar
ENTRYPOINT ["java", "-jar", "Mylibrary-v1.jar"]	