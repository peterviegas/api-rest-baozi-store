### Trabalho de desenvolvimento Web Back-End
API REST - Boazi Store

Disciplica: Desenvolvimento Web Back-End
Tecnologias: Java, Spring Boot, Spring Data JPA, MySQL, Postman

By: Samuel

---

### Criação do projeto
<img width="1603" height="714" alt="image" src="https://github.com/user-attachments/assets/8d1af263-0e5c-4e94-8e93-ceb36af51ab1" />

--- 

### Banco de Dados

```
CREATE DATABASE baozi_store;
```

### Tabelas

```
USE baozi_store;

CREATE TABLE cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cliente_desde DATE NOT NULL
);

CREATE TABLE produto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque BOOLEAN NOT NULL
);

CREATE TABLE pedido (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT NOT NULL,
    produto_id BIGINT NOT NULL,
    quantidade INT NOT NULL,

    CONSTRAINT fk_pedido_cliente
        FOREIGN KEY (cliente_id)
        REFERENCES cliente(id),

    CONSTRAINT fk_pedido_produto
        FOREIGN KEY (produto_id)
        REFERENCES produto(id)
);
```
### Índices

```
CREATE INDEX idx_pedido_cliente ON pedido(cliente_id);
CREATE INDEX idx_pedido_produto ON pedido(produto_id);
```

### Estrutura do projeto

```
com.baozi
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 └── mapper
```

