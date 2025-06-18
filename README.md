# 🚗 Carflux

Sistema de gerenciamento de clientes, contatos e endereços desenvolvido com **Spring Boot**, **JPA**, **MySQL** e **Bootstrap** no front-end.

---

## 📋 Funcionalidades

* Cadastro de clientes
* Atualização de dados com validação
* Relacionamento entre Cliente, Endereço e Contato
* Persistência com JPA/Hibernate
* Integração com banco de dados MySQL
* Testes unitários com JUnit
* Interface com HTML + CSS + Bootstrap
* Consumo de API com **fetch**

---

## 💠 Tecnologias utilizadas

### Backend

* Java 17
* Spring Boot 3.5
* Spring Data JPA
* Spring Security
* MySQL
* JUnit 5
* H2 Database (para testes)
* Maven

### Frontend

* HTML5
* CSS3
* Bootstrap 5
* JavaScript (fetch API)

---

## 🫠 Requisitos

* Java 17 instalado
* MySQL rodando
* Maven instalado

---

## ⚙️ Como rodar o projeto

```bash
# Clone o repositório
git clone https://github.com/cristianrs-dev/Carflux.git
cd Carflux

# Configure o banco de dados em application.properties
# Execute a aplicação
./mvnw spring-boot:run
```

---

## 🧪 Executar os testes

```bash
./mvnw test
```

---

## 🗃️ Estrutura do Projeto

```
src/
 └── main/
      └── java/com/carflux/carflux
           ├── controller
           ├── model
           ├── repository
           └── service
 ├── resources/static/
           ├── css/
           ├── js/
           └── index.html
 └── test/
      └── java/com/carflux/carflux
```

---

## ✍️ Autor

**Cristian Ramos**
Desenvolvedor Full Stack Java
[LinkedIn](https://www.linkedin.com/in/seu-perfil)

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-green)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-blueviolet)
![License](https://img.shields.io/badge/license-MIT-green)
