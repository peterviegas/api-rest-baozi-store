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
 ├── exception
 └── mapper
```
### Postman

<img width="310" height="489" alt="image" src="https://github.com/user-attachments/assets/c8248a70-e28f-4e7f-b547-b1e336a32892" />

---

### Cliente

<img width="1092" height="380" alt="image" src="https://github.com/user-attachments/assets/f590d50c-8e76-4988-a23d-cbd1302c9409" />


<img width="1085" height="677" alt="image" src="https://github.com/user-attachments/assets/8229379d-a253-4ba3-a933-f892f5ba1120" />


<img width="1086" height="429" alt="image" src="https://github.com/user-attachments/assets/0ea7880e-45ca-4f4e-bf80-73be1dde74b8" />


<img width="1094" height="430" alt="image" src="https://github.com/user-attachments/assets/cf2c7040-5477-4a31-8ab4-383d2034c0b8" />


<img width="1095" height="352" alt="image" src="https://github.com/user-attachments/assets/29e2e7f3-890d-492e-9796-9d5d8c9f9d67" />

---

### Produto

<img width="1096" height="427" alt="image" src="https://github.com/user-attachments/assets/eddec688-6984-4a1d-99fd-df94cb8ea474" />


<img width="1090" height="554" alt="image" src="https://github.com/user-attachments/assets/457bd794-ec38-48c1-8ca4-65b71fe37ec2" />


<img width="1081" height="455" alt="image" src="https://github.com/user-attachments/assets/e24aedb7-ee08-4819-baf7-339c6aabcb3c" />


<img width="1091" height="472" alt="image" src="https://github.com/user-attachments/assets/d2a2b806-4928-4f7c-863b-b8991a1f6c20" />


<img width="1092" height="401" alt="image" src="https://github.com/user-attachments/assets/7329b0e2-57b7-4870-b1f0-f3873511b6a7" />

---

### Pedidos

<img width="1085" height="589" alt="image" src="https://github.com/user-attachments/assets/f6446136-f1dc-4f3e-ad4d-5fca88bf462a" />


<img width="1092" height="936" alt="image" src="https://github.com/user-attachments/assets/1299653a-8c7f-4e2b-8d16-7cd2808a4bbf" />


<img width="1085" height="782" alt="image" src="https://github.com/user-attachments/assets/47b6bc11-ee75-4194-a58a-4e48ef62de67" />


<img width="1103" height="769" alt="image" src="https://github.com/user-attachments/assets/1fefc4a3-0cfd-4c7f-945a-a901d4c2e1cd" />


<img width="1092" height="408" alt="image" src="https://github.com/user-attachments/assets/2c3d5c09-7dee-4cee-a665-f77d0065280a" />

---

### Testes forçando erro

### Cliente

Passando um id não existente
<img width="1084" height="414" alt="image" src="https://github.com/user-attachments/assets/2817140f-a1a6-4c0f-a211-6d1ad122f02b" />


Criação sem passar parâmetros
<img width="1085" height="432" alt="image" src="https://github.com/user-attachments/assets/d03cef1d-76b0-42cb-8bbf-b2ae653ca1e9" />


Update sem chave do id do cliente
<img width="1082" height="436" alt="image" src="https://github.com/user-attachments/assets/533cdf86-9654-41d8-a786-81233b5c7239" />


Update com parâmetros mas com id inválido
<img width="1088" height="464" alt="image" src="https://github.com/user-attachments/assets/98b9875b-3329-417e-ae65-8fa574f292f2" />

---

### Produto

Passando um id não existente
<img width="1087" height="440" alt="image" src="https://github.com/user-attachments/assets/5c026df5-f78f-4c29-9acd-21307927448b" />


Criação sem passar parâmetros
<img width="1095" height="493" alt="image" src="https://github.com/user-attachments/assets/f9713768-fe86-410a-8c98-c78612f668f6" />


Update sem chave id do Produto
<img width="1090" height="477" alt="image" src="https://github.com/user-attachments/assets/363a8829-cf7e-4905-be06-6990a0c20223" />


Update com parâmetros mas com id inválido
<img width="1099" height="488" alt="image" src="https://github.com/user-attachments/assets/46692215-2fe6-4149-8c68-670946f46d8b" />

---

### Pedido

Passando um id não existente
<img width="1093" height="429" alt="image" src="https://github.com/user-attachments/assets/b4e81068-853b-4a13-aaf3-ba87d692d9e7" />


Criação sem passar parâmetros
<img width="1097" height="436" alt="image" src="https://github.com/user-attachments/assets/c2ac2797-671d-4f96-989e-844254a95dd6" />


Update sem chave id do Pedido
<img width="1077" height="604" alt="image" src="https://github.com/user-attachments/assets/66649cd9-4e5f-4b39-99b3-3b8ee89f0a0a" />


Update com parâmetros mas com id inválido
<img width="1089" height="609" alt="image" src="https://github.com/user-attachments/assets/1afae6fe-9d42-4a4c-b262-0ec06682cdc2" />

























