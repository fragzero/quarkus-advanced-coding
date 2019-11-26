# Documentacao

## Criar novo projeto quarkus
```sh
$ mvnw io.quarkus:quarkus-maven-plugin:1.0.0.CR1:create -DprojectGroupId=br.com.accurate -DprojectArtifactId=advanced-coding -DclassName="br.com.accurate.advanced.coding.algoritimo1" -Dpath="/algoritimo1" -Dextensions=openapi,resteasy-jsonb,swagger-ui
```

## Compilar e rodar mode dev
```sh
$ mvnw compile quarkus:dev
```

## GET
http://localhost:8080/algoritimoUm/24/9

## POST
http://localhost:8080/swagger-ui/#/

## MDC
https://www.baeldung.com/java-greatest-common-divisor