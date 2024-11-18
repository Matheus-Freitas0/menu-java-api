
# Menu Java API

API desenvolvida em Java usando o framework Spring, com o objetivo de gerenciar menus de um sistema de restaurante. Este projeto utiliza o Maven para gerenciamento de dependências e construção.

## Tabela de Conteúdos

-   [Sobre o Projeto](#sobre-o-projeto)
-   [Funcionalidades](#funcionalidades)
-   [Tecnologias Utilizadas](#tecnologias-utilizadas)
-   [Instalação](#instala%C3%A7%C3%A3o)
-   [Uso](#uso)
-   [Contribuição](#contribui%C3%A7%C3%A3o)
-   [Licença](#licen%C3%A7a)

## Sobre o Projeto

O projeto **Menu Java API** foi desenvolvido para servir como backend de um sistema de gerenciamento de menus de restaurante, possibilitando a criação, leitura, atualização e exclusão (CRUD) de itens do menu.

## Funcionalidades

-   Adicionar itens ao menu com informações detalhadas.
-   Listar todos os itens do menu.
-   Atualizar informações de um item específico.
-   Excluir itens do menu.

## Tecnologias Utilizadas

-   **Java 17+**: Linguagem principal do projeto.
-   **Spring Boot**: Framework para criação de aplicações Java com configuração mínima.
-   **Spring Data JPA**: Abstração para persistência de dados.
-   **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
-   **Maven**: Gerenciador de dependências e automação de builds.

## Instalação

Para executar o projeto em sua máquina, siga as etapas abaixo:

1.  Clone o repositório:

    `git clone https://github.com/Matheus-Freitas0/menu-java-api.git` 
    
2.  Navegue até o diretório do projeto:

    `cd menu-java-api` 
    
3.  Compile e execute o projeto usando o Maven:

    `mvn spring-boot:run` 
    

## Uso

Após iniciar a aplicação, você poderá acessar a API nos seguintes endpoints:

-   `GET /api/menu-items`: Retorna a lista de itens do menu.
-   `POST /api/menu-items`: Adiciona um novo item ao menu.
-   `PUT /api/menu-items/{id}`: Atualiza as informações de um item específico.
-   `DELETE /api/menu-items/{id}`: Remove um item do menu.

Para testar os endpoints, você pode usar o [Postman](https://www.postman.com/) ou ferramentas semelhantes.

## Contribuição

Contribuições são bem-vindas! Para contribuir, siga os passos abaixo:

1.  Realize um fork do repositório.
2.  Crie uma nova branch com sua feature:
    `git checkout -b feature/nome-da-feature` 
    
3.  Faça o commit de suas alterações:

    `git commit -m 'Adiciona nova funcionalidade'` 
    
4.  Envie para o branch principal:

    `git push origin feature/nome-da-feature` 
    
5.  Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

