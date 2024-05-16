# Instruções para documentar a API com o Springdoc (Swagger) 

## Adicionar a dependência Spring validation no pom.xml

[pom.xml](pom.xml-fragment.txt)


## Adicionar a anotação de validação desejada no atributo da Entidade

[Entidade](QualquerEntidade.java)


### Adicionar a anotação @Valid no método do Controller onde deseja validar os dados

[Controller](QualquerController.java)


### Capturar a exceção, via classe @RestControllerAdvice, caso a validação não seja atentida
