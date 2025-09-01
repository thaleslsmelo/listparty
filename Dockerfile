# 1: build do projeto
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app

# Copia os arquivos do Maven e baixa dependências (cache)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código e faz o build
COPY src ./src
RUN mvn clean package -DskipTests

# 2: imagem final
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copia o JAR gerado na etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta (o Render usa PORT, mas deixamos 8080 como padrão)
EXPOSE 8080

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]
