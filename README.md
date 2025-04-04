# 📘 API - Catálogo de Carros

Projeto desenvolvido para a disciplina de Java Advancede, com o objetivo de criar uma Web API RESTful para gerenciar um catálogo de veículos com foco em desempenho, economia e tipo de veículo.

---

## 🛠 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MYSQL
- JUnit 5  
- Swagger (Springdoc OpenAPI)  
- Git + GitHub para versionamento

---

## 📁 Estrutura do Projeto

- `model`: Entidades do banco (`Carro`, `TipoVeiculo`)
- `repository`: Interface de persistência (`CarroRepository`)
- `service`: Camada de regras de negócio (`CarroService`)
- `controller`: Endpoints REST (`CarroController`)
- `controller.ApiExceptionHandler`: Tratamento global de erros
- `test`: Testes unitários com MockMvc

---

## 🔗 Endpoints Implementados

### 🔍 Consulta
| Verbo | Rota                  | Descrição                                  |
|-------|-----------------------|---------------------------------------------|
| GET   | `/carros/potencia`    | Retorna os 10 carros com maior potência     |
| GET   | `/carros/economia`    | Retorna os 10 carros com maior economia     |
| GET   | `/carros/eletricos`   | Lista todos os carros elétricos             |
| GET   | `/carros/{id}`        | Retorna detalhes de um carro por ID         |

### ✍️ Manutenção
| Verbo | Rota                  | Descrição                                  |
|-------|-----------------------|---------------------------------------------|
| POST  | `/carros`             | Adiciona um novo carro                      |
| PUT   | `/carros/{id}`        | Atualiza os dados de um carro existente     |
| DELETE| `/carros/{id}`        | Remove um carro do catálogo                 |

---

## ✅ Testes

Testes unitários implementados em `CarroControllerTests` utilizando JUnit 5 e MockMvc.

---

## ⚠️ Tratamento de Erros

Todos os erros genéricos são tratados globalmente usando `@ControllerAdvice` na classe `ApiExceptionHandler`, retornando código HTTP 500 com mensagem.




