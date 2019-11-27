# Advanced Coding

 - Algoritmo 1: Dado dois inteiros positivos m e n, calcular o máximo divisor comum d. Ou seja, o maior inteiro positivo que divide tanto m, quanto n
 - Algoritmo 2: Seja d, o mdc de m e n, ache 2 inteiros a e b, tal que a*m+b*n=d
 - Algoritmo 3: Calcular o mínimo múltiplo comum de dois inteiros positivos m e n. Ou seja, o menor inteiro positivo que é múltiplo simultaneamente de m e n.
 - Algoritmo 4: Dado uma data d, descubra quando vai ocorrer o próximo eclipse de saros: https://eclipse.gsfc.nasa.gov/SEsaros/SEsaros.html

## Criar novo projeto quarkus
```sh
$ mvn io.quarkus:quarkus-maven-plugin:1.0.0.CR1:create \
-DprojectGroupId=br.com.accurate \
-DprojectArtifactId=advanced-coding \
-DclassName="br.com.accurate.advanced.coding.Algoritimo1" \
-Dpath="/algoritimo-um" \
-Dextensions=openapi,resteasy-jsonb,swagger-ui
```

## Compilar executar
```sh
$ mvn compile quarkus:dev
```

## Documentacao API
http://localhost:8080/swagger-ui/

## Alguns exemplos
### GET
http://localhost:8080/algoritimo-1/mdc/24/60

### POST - 2 numeros
```json
{ "m": 24, "n": 60 }
```
http://localhost:8080/algoritimo-1/mdc

### POST - Lista
```json
{ "n": [24,60,300] }
```
http://localhost:8080/algoritimo-1/mdc/list

