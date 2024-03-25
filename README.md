# Automatizando limedrop
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/ViniciusODantas/teste-datum-web-limedrop/blob/main/LICENSE)

# Sobre o projeto

https://www.limedrop.com.br/

O site limedrop é um e-commerce de roupas e seu foco são marcas importadas e sempre visando a qualidade e amizade com o cliente.

Foi feito a automação dos fluxos mais usados no site: Fluxo venda E2E, cadastro de novos usuarios e exclusão de carrinho.

# História do usuário

Funcionalidade: Comprar produto na limedrop

EU como cliente
QUERO efetuar uma compra de produtos
PARA me sentir bem vestido

Cenário: Efetuar cadastro de novo cliente

DADO que estou na limedrop
QUANDO acesso a tela de login
E não possuo acesso
E preencho os dados de segurança e pessoais
ENTÃO acesso é criado com sucesso

Cenário: Efetuar compra de 3 itens na limedrop

DADO que estou logado com a minha conta pessoal
QUANDO acesso o catalogo da limedrop
E adiciono ao carrinho o produto "Air Jordan 4 Retro Bred Reimagined"
E adiciono ao carrinho o produto "Blusa de Moletom Fechada HUGO Bordada Cinza"
E adiciono ao carrinho o produto "Nike x NOCTA Cap - White"
E preencho os dados de pagamento
ENTÃO finalizo a minha compra

# Tecnologias utilizadas
## Automação
- Java
- Selenium WebDrive
- JDK
- Maven
- ChromeDriver

# Como executar o projeto

## Links importantes

```bash
. https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java - Repositorio mvn
. https://spring.io/tools - Spring tool (Ferramenta de editor de texto)
. https://googlechromelabs.github.io/chrome-for-testing/ - ChromeDriver

```

## Ferramentas
Pré-requisitos: Java

```bash
. JDK
. Spring tool
. ChromeDriver

```

## Automação
Pré-requisitos: Instalar ferramentas

```bash
# Download dos arquivos
limedrop.zip
pom.xml

# Acessar um editor de como o Spring tool
Importar os arquivos

# instalar dependências
Selenium Java

# executar o projeto
Antes da execução da class "CompraCliExistente" executar a class "LimparCarrinho" para excluir o carrinho
```

# Autor

Vinicius de Oliveira Dantas

https://www.linkedin.com/in/vinicius-dantas-a88b36122
