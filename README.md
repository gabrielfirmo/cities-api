# Cities API

Este projeto consiste na construção de uma API REST para consulta de países, cidades e estados brasileiros, além de calcular a distância entre cidades do Brasil. Foi utilizado o framework Spring para o desenvolvimento, PostgreSql para gerenciar o banco de dados e a plataforma Heroku para hospedar a aplicação.

A base de dados utilizada é encontrada [aqui](https://github.com/chinnonsantos/sql-paises-estados-cidades).



## Exemplos

São exemplos de URLs suportadas:

* Listar a primeira página de países https://frozen-reaches-81528.herokuapp.com/countries
* Escolher uma página e definir a quantidade de países em cada uma https://frozen-reaches-81528.herokuapp.com/countries?page=5&size=20 
* Encontrar um país pelo Id https://frozen-reaches-81528.herokuapp.com/countries/225 
* Listar todos os estados https://frozen-reaches-81528.herokuapp.com/states
* Encontrar um estado pelo Id https://frozen-reaches-81528.herokuapp.com/states/16
* Listar a primeira página de cidades https://frozen-reaches-81528.herokuapp.com/cities
* Escolher uma página e definir a quantidade de cidades em cada uma https://frozen-reaches-81528.herokuapp.com/cities?page=2&size=73
* Encontrar uma cidade pelo Id https://frozen-reaches-81528.herokuapp.com/cities/3315
* Calcular a distância em Km entre duas cidades por meio de seus Ids https://frozen-reaches-81528.herokuapp.com/distances?from=3315&to=147



### Documentação relativa ao cálculo de distância

* [Postgres Earth distance](https://www.postgresql.org/docs/current/earthdistance.html)
* [earthdistance--1.0--1.1.sql](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.0--1.1.sql)
* [OPERATOR <@>](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.1.sql)
* [postgrescheatsheet](https://postgrescheatsheet.com/#/tables)
* [datatype-geometric](https://www.postgresql.org/docs/current/datatype-geometric.html)



## Material de apoio

### Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Properties

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Types

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

## Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

