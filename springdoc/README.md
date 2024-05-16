# Instruções para documentar a API com o Springdoc (Swagger) 

## Adicionar a dependência org.springdoc no pom.xml

[pom.xml](pom.xml-fragment.txt)


## Customizar o cabeçalho do Swagger

### Criar o SpringdocConfig (@Configuration)

[SpringdocConfig](SpringdocConfig.java)

#### Caso a API utilize o Spring Security, utilizar a classe de configuração que contém os respectivos schemas

[SpringdocSecurityConfig](SpringdocSecurityConfig.java)

### Adicionar as propriedades do cabeçalho no application.properties

[application.properties](application.properties)


### Acessar a documentação

[Documentação da API](http://localhost:8080/swagger-ui/index.html)


### Para mais informações, acessar a documentação oficial

[Springdoc-openapi](https://springdoc.org/)
