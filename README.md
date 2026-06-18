# PetsCare

# 1. Apresentação do Projeto

## PetShop - PetsCare
O PetsCare é um aplicação web desenvolvido para a simulação de um pet shop. Ela contém cadastro e gerenciamento de produtos, categorias, usuários, pedidos e itens do carrinho de compras, oferecendo uma experiência completa tanto para clientes quanto para administradores.

Entre as principais funcionalidades estão a autenticação de usuários, gerenciamento de estoque, controle de pedidos, carrinho de compras e uma área administrativa.

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
# 6. Endpoints da API
## Categorias
**GET** /api/categorias
**POST** /api/categorias
**PUT** /api/categorias/{id}
**DELETE** /api/categorias/{id}

## Produtos
**GET** /api/produtos
**GET** /api/produtos/categoria/{id}
**POST** /api/produtos
**DELETE** /api/produtos/{id}

## Usuários
**GET** /api/usuarios
**POST** /api/usuarios
**PUT** /api/usuarios/{id}
**DELETE** /api/usuarios/{id}

## Carrinho
**POST** /api/carrinho/adicionar
**GET** /api/carrinho/{idPedido}

## Pedidos
**GET** /api/pedidos
**GET** /api/pedidos/carrinho/{idUsuario}
 
## 7. Principais Funcionalidades

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

## 8. Desenvolvedora

Gabriela Grandini do Prado

