
## Criar novo projeto quarkus
 mvnw io.quarkus:quarkus-maven-plugin:1.0.0.CR1:create -DprojectGroupId=br.com.accurate -DprojectArtifactId=advanced-coding -DclassName="br.com.accurate.advanced.coding.algoritimo1" -Dpath="/algoritimo1" -Dextensions=openapi,resteasy-jsonb,swagger-ui

## compilar e rodar mode dev
 mvnw compile quarkus:dev

## url acesso
http://localhost:8080/algoritimo1/24/9