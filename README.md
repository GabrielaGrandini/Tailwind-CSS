# PetsCare

## 1. Apresentação do Projeto

### PetsCare

O PetsCare é uma aplicação web desenvolvida para simular o funcionamento de um pet shop, oferecendo recursos para clientes e administradores.

O sistema permite o gerenciamento de produtos, categorias, usuários, carrinho de compras e pedidos, proporcionando uma experiência completa de compra online para produtos destinados a animais de estimação.

Entre as principais funcionalidades estão:

* Cadastro e autenticação de usuários;
* Recuperação de senha;
* Cadastro e gerenciamento de categorias;
* Cadastro e gerenciamento de produtos;
* Upload de imagens para produtos;
* Carrinho de compras;
* Controle de estoque;
* Registro e acompanhamento de pedidos;
* Área administrativa;
* Responsividade para dispositivos móveis.

---

## 2. Tecnologias Utilizadas

### Back-end

* Java
* Spring Boot
* Spring Data JPA
* Maven

### Banco de Dados

* MySQL

### Front-end

* HTML5
* Tailwind CSS
* JavaScript

---

## 3. Estrutura do Projeto

O projeto segue a arquitetura em camadas utilizada pelo Spring Boot.

### Controller

Responsável por receber as requisições HTTP e retornar as respostas da API.

### Service

Responsável pelas regras de negócio da aplicação.

### Repository

Responsável pelo acesso e manipulação dos dados no banco de dados através do Spring Data JPA.

### Entity

Representa as tabelas do banco de dados.

### Front-end

Responsável pela interface do usuário utilizando HTML, Tailwind CSS e JavaScript.

---

## 4. Banco de Dados

### Nome do Banco

petshop

### Principais Tabelas

#### Usuario

Armazena as informações dos usuários cadastrados.

#### Categoria

Armazena as categorias dos produtos.

#### Produto

Armazena os produtos disponíveis para venda.

#### Pedido

Armazena os pedidos realizados pelos clientes.

#### ItemPedido

Armazena os produtos pertencentes a cada pedido.

### Relacionamentos

* Uma categoria possui vários produtos;
* Um produto pertence a uma categoria;
* Um usuário pode possuir vários pedidos;
* Um pedido possui vários itens;
* Um produto pode estar presente em vários itens de pedido.

### DER

Inserir aqui a imagem do DER/MER do banco de dados.

---

## 5. Como Executar o Projeto

### 1. Clonar o Repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Configurar o Banco de Dados

Criar um banco MySQL chamado:

```sql
CREATE DATABASE petshop;
```

### 3. Configurar o application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/petshop
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Executar a Aplicação

Abrir o projeto em uma IDE Java (Spring Tool Suite, Eclipse ou IntelliJ).

Executar a classe principal do Spring Boot.

Após iniciar, a API estará disponível em:

```bash
http://localhost:8080
```

---

## 6. Principais Funcionalidades

* Cadastro de usuários;
* Login e autenticação;
* Recuperação de senha;
* Cadastro de categorias;
* Cadastro de produtos;
* Edição de produtos;
* Exclusão de produtos;
* Upload de imagens;
* Busca de produtos por nome;
* Carrinho de compras;
* Controle de estoque;
* Registro de pedidos;
* Histórico de pedidos;
* Área administrativa;
* Responsividade para dispositivos móveis.

---

## 7. Desenvolvedora

Gabriela Grandini do Prado

