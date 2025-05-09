

# 💳 Sistema de Pagamentos SOLID - Java (com Design Patterns)

Este projeto é um exemplo profissional de como aplicar **POO, SOLID** e **Design Patterns (como Strategy e Factory)** em um sistema real de pagamentos com múltiplos métodos (PIX, Cartão e Boleto), utilizando **Java** e banco de dados **MySQL**.

## ✅ Objetivos
- Demonstrar os 4 pilares da POO (Abstração, Encapsulamento, Herança, Polimorfismo).
- Aplicar os 5 princípios do SOLID.
- Usar padrões de projeto reais e úteis para entrevistas.
- Conectar com um banco MySQL real para tornar o projeto profissional.

---

## 🧱 Tecnologias
- Java 21+
- MySQL
- JDBC
- Gradle/Maven (build)
- SOLID + Padrões de Projeto (Strategy, Factory, Dependency Injection)

---

## 📂 Estrutura
```
src/
├── domain/
│   ├── payment/                # Interface + Estratégias de pagamento
│   └── services/               # Serviços de aplicação (uso de abstrações)
├── infra/
│   ├── factory/                # Padrão Factory (instanciador de estratégias)
│   └── db/                     # Repositório JDBC para persistência
└── app/Main.java               # Simula uso do sistema
```

---

## ⚙️ Configuração do banco MySQL
1. Crie um banco chamado `solid_payments`:
```sql
CREATE DATABASE solid_payments;
```
2. Crie a tabela de pagamentos:
```sql
CREATE TABLE payments (
  id INT AUTO_INCREMENT PRIMARY KEY,
  method VARCHAR(50),
  amount DOUBLE,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

3. Configure o `.env` ou as credenciais diretamente no `DbConnection.java`.

---

## 🚀 Rodando o projeto

```bash
# Compile e execute com seu build tool preferido (Gradle/Maven)
# Ou diretamente com javac/java (ajuste os paths conforme necessário)
```

---

## 🧠 Como aplicamos SOLID

| Princípio | Aplicação                                                                 |
|-----------|---------------------------------------------------------------------------|
| SRP       | Cada classe tem apenas uma responsabilidade (ex: `PixPayment`, `Factory`) |
| OCP       | Podemos adicionar novos métodos de pagamento sem alterar o código existente |
| LSP       | Todas as implementações respeitam a interface `PaymentMethod`             |
| ISP       | `PaymentMethod` define apenas o que é necessário para pagamento           |
| DIP       | `PaymentService` depende da interface, não da implementação               |

---

## 🧠 Design Patterns usados

- **Strategy**: Cada forma de pagamento implementa sua própria estratégia.
- **Factory**: Cria dinamicamente o tipo de pagamento com base em um parâmetro.
- **Injeção de dependência**: `PaymentService` recebe a estratégia via construtor.

---

## ✉️ Contato
João Barbosa - [joaobarbosadev.vercel.app](https://joaobarbosadev.vercel.app)

