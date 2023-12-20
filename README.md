<h1 align="center">DSCommerce</h1>

<p align="center">
  <a href="https://github.com/zaidancarvalho/dscommerce/blob/main/LICENSE">
    <img src="https://img.shields.io/npm/l/react" alt="License" />
  </a>
  <img src="https://img.shields.io/badge/Spring_Boot%20V2.7.3-F2F4F9?style=for-the-badge&logo=spring-boot" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
</p>


# Sobre o projeto
O DSCommerce é um e-commerce. Você pode explorar diferentes produtos, ver detalhes, adicionar ao carrinho e finalizar compras. 
Para complementar a segurança, há um login. Além disso, foi criado uma área para diferenciar quem é o usuário e o adminstrador, 
fazendo que exista uma função específica para cada papel.

Criado pelo orientador [Nelio Alves](https://github.com/devsuperior) na plataforma [DevSuperior](https://devsuperior.com.br/).

## Objetivo do projeto:
- Implementar modelo de domínio
- Arquitetura em camadas
- Operações CRUD
- Povoar o banco de dados
- Fluxos de caso de uso
- Diferenciação de perfis e controle de acesso
- Interação com o produto
- Autenticação e segurança
- Integração e relatórios administrativos
- Tratamento de exceções personalizadas

# Apresentação do projeto
## Modelo conceitual
<img src="https://github.com/zaidancarvalho/dscommerce/assets/98346506/119de74b-e403-493e-81f0-b801f1da8630" width = 70% height = 70%>

## Caso de uso
O escopo funcional do sistema consiste nos seguintes casos de uso:

| Caso de uso         | Visão geral                                                                                             | Acesso         |
|:--------------------|:--------------------------------------------------------------------------------------------------------|:---------------|
| Manter produtos     | CRUD de produtos, podendo filtrar itens pelo nome                                                       | Somente Admin  |
| Manter categorias   | CRUD de categorias, podendo filtrar itens pelo nome                                                     | Somente Admin  |
| Manter usuários     | CRUD de usuários, podendo filtrar itens pelo nome                                                       | Somente Admin  |
| Gerenciar carrinho  | Incluir e remover itens do carrinho de compras, bem como alterar as quantidades do produto em cada item | Público        |                                                                              
| Consultar catálogo  | Listar produtos disponíveis, podendo filtrar produtos pelo nome                                         | Público        |                                                                              
| Sign up             | Cadastrar-se no sistema                                                                                 | Público        |                                              
| Login               | Efetuar login no sistema                                                                                | Público        |                                               
| Registrar pedido    | Salvar no sistema um pedido a partir dos dados do carrinho de compras informado                         | Usuário logado |                                                                       
| Atualizar perfil    | Atualizar o próprio cadastro                                                                            | Usuário logado |                         
| Visualizar pedidos  | Visualizar os pedidos que o próprio usuário já fez                                                      | Usuário logado |
| Registrar pagamento | Salvar no sistema os dados do pagamento de um pedido                                                    | Somente Admin  |                                                                        
| Reportar pedidos    | Relatório de pedidos, podendo ser filtrados por data                                                    | Somente Admin  |

<img src="https://github.com/zaidancarvalho/dscommerce/assets/98346506/4b52d840-9e5d-44b4-8b25-656b9376b843" width = 70% height = 70%>

## Camada lógica
<img src="https://github.com/zaidancarvalho/dscommerce/assets/98346506/68c7f346-093c-4055-9226-9f5c73d57f1b" width = 70% height = 70%>

## Spring Tools Suite - IDE
<img src="https://github.com/zaidancarvalho/dscommerce/assets/98346506/e3ddb6eb-4d81-4eea-b774-6dde89d21d7f" width = 70% height = 70%>

## H2 Database
<img src="https://github.com/zaidancarvalho/dscommerce/assets/98346506/abff9add-c55f-4519-932f-027895d7a193" width = 70% height = 70%>

## Postman
<img src="https://github.com/zaidancarvalho/dscommerce/assets/98346506/6c14a133-a703-46d3-b769-047c67c4fb4d" width = 70% height = 70%>

# Tecnologias utilizadas
## Back end
- Java 17
- Spring Tool Suite
- Spring Boot 2.7.3
- JPA / Hibernate
- Maven
- H2 Database
- Postman
- JWT
- OAuth2
- JSON
- Spring Validation
  
# Como clonar o projeto

## Back end

```bash
#clonar repositório
git clone git@github.com:zaidancarvalho/dscommerce.git

#abrir sua IDE e escolher a pasta onde está o projeto
exemplo: springboot/projetoCLonado

#executar o projeto
botão direito no CourseApplication.java
run as
SpringBoot app
```

# Como executar localmente

- Ao executar o projeto, para acessar o banco de dados, acesse: http://localhost:8080/h2-console

- Para realizar as requisições: GET/PUT/DELETE E UPDATE é preciso fazer o login.
  
   - Login como usuário: maria@gmail.com
   - Login como administrador: alex@gmai.com
   - Senha de ambos: 1234567

# Autor

Felipe Carvalho Fernandez

https://www.linkedin.com/in/fernandez-felipe/

# Agradecimento
Agradecer ao [Nélio Alves](https://www.linkedin.com/in/nelio-alves/) da [DevSuperior](https://devsuperior.com.br/).

Meu mentor nessa jornada incrível como desenvolvedor back-end.
