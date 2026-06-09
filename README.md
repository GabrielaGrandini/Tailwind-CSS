# Tailwind-CSS

# 1. Apresentação do Projeto

## PetShop - PetsCare
O PetsCare é um aplicação web desenvolvido para a simulação de um pet shop. Ela contém cadastro e gerenciamento de produtos, categorias, usuários, pedidos e itens do carrinho de compras, oferecendo uma experiência completa tanto para clientes quanto para administradores.

Entre as principais funcionalidades estão a autenticação de usuários, gerenciamento de estoque, controle de pedidos, carrinho de compras e uma área administrativa.

# 2. Tecnologias Utilizadas

 * Java;
 * Spring Boot;
 * Spring Data JPA;
 * MySQL;
 * Maven;
 * HTML5;
 * Tailwind CSS;
 * JavaScript;

# 3. Estrutura do Projeto
Explicar a organização das principais pastas e camadas da aplicação.
Exemplos:
Controller;
Service;
Repository;
Entity;

# 4. Banco de Dados (MER/DER - Se possível a imagem)
## Principais Tabelas
* Usuario
* Produto
* Categoria
* Pedido
* ItemPedido

## Relacionamentos
* Uma categoria possui vários produtos.
* Um pedido possui vários itens.
* Um usuário pode possuir vários pedidos.
* Um produto pode estar presente em vários itens de pedido.

# 5. Como Executar o Projeto
Criar um passo a passo explicando:
Como clonar o repositório;
Como configurar o banco de dados;
Como configurar o arquivo application.properties;
Como executar a aplicação.

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

# 7. Funcionalidades Implementadas
* Cadastro de usuários
* Login de usuários
* Recuperação de senha
* Cadastro de categorias
* Cadastro de produtos
* Upload de imagens
* Carrinho de compras
* Controle de estoque
* Gerenciamento de pedidos
* Área administrativa
* Responsividade para dispositivos móveis

# 8. Integrantes da Equipe / Desenvolvedor
## Gabriela Grandini do Prado
