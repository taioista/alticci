# Alticci Project

The goal is to calculate a sequence according to the logic:

```
n=0 => a(0) = 0
n=1 => a(1) = 1
n=2 => a(2) = 1
n>2 => a(n) = a(n-3) + a(n-2)
```

Alongside the api REST you'll encounter a simple front-end that can be used to test

## Tecnologies

* Java 11
* Quarkus 2.10.2
* Angular 14


## Running the application in dev mode

* For Quarkus (Go to /api):

```shell
./mvnw quarkus:dev
```

* For Angular (Go to /alticci-front):
```shell
ng serve
```


As long as api stays running you may access the Api documentation on the following URL:

```
http://localhost:8080/q/swagger-ui
```