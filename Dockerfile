# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim
LABEL authors="Richa"
# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app
# Copiar el archivo JAR generado al contenedor
COPY target/ova-service-0.0.1-SNAPSHOT.jar app.jar
# Exponer el puerto en el que la aplicación se ejecuta
EXPOSE 8080
# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]

