# Buriti Comandas

## Descrição
O **Buriti Comandas** é um sistema de controle de comandas para bares e restaurantes.

## Versão
A versão atual do projeto é **0.0.1-SNAPSHOT**.

## Pré-requisitos
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (Versão 17)
- [Maven](https://maven.apache.org/download.cgi)

## Dependências
O projeto utiliza o **Spring Boot** na versão **2.7.16** como parent e inclui as seguintes dependências:

- **spring-boot-starter-web**: Oferece suporte para a construção de aplicativos da web usando o Spring MVC.
- **spring-boot-devtools**: Fornece ferramentas de desenvolvimento, como reinicialização automática do aplicativo.
- **Loombok**: Biblioteca de anotação Java que ajuda a reduzir o código padrão.
- **Spring Data JPA**: Persiste dados em armazenamentos SQL com Java Persistence API usando Spring Data e Hibernate.
- **H2 Database**: Fornece um banco de dados rápido na memória que suporta API JDBC e acesso R2DBC, com um espaço ocupado pequeno (2 MB). Suporta modos incorporados e de servidor, bem como um aplicativo de console baseado em navegador.
- **Validation**: Validação de Bean com Hibernate.




## Configuração
O projeto utiliza o plugin **spring-boot-maven-plugin** para facilitar a construção e execução. Certifique-se de ter o Maven instalado e execute o seguinte comando para iniciar a aplicação:

```bash
mvn spring-boot:run
```