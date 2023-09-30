<h1 align="center">
        <img alt="Banner" title="#Banner" style="object-fit: contain; height:250px;" src="https://media.discordapp.net/attachments/929069726372597815/1149490892747579402/image.png?width=517&height=130"  />
</h1>

# 📝 API Bancária - Bootcamp Santander 2023

<p align="center"> Projeto final de API utilizando SpringBoot.</p>

# 🛠 Tecnologias Utilizadas

- SpringBoot
- OpenFeign
- JUnit e Mockito para Testes
- Swagger para documentação
- Spring Security
- Lombok

# 🎯 Objetivo Principal

O objetivo principal era colocar em prática todo o conhecimento adquirido durante o curso, criando uma API Bancária seguindo as melhores condutas dos padrões de projeto. Além de ser uma API segura, com consultas externas e testes para garantir a escalabilidade do projeto.


# 🎨 Diagrama do Projeto

```mermaid
classDiagram
  class Account {
    +id: UUID
    +number: Long
    +agency: string
    +balance: dobule
    +limit: double
  }
  
  class Card {
    +id: UUID
    +number: number
    +type:CardType
    +limit: double
  }
  
  class Client {
    +cpf: string
    +name: string
    +password: string
    +role: UserRole
    +birthdate: Date
    +complement: string
    +number: string
  }

  
  class Address {
    +id: string
    +cep: string
    +street: string
    +district: string
    +city: string
    +uf: string
  }
  class CardType{
    +id: int
    +description: string
  }
  
  class PaymentMethod {
    +id: string
    +icon: string
    +description: string
  }
  
  Account <--  Client
  Account <-- Card
Client <-- Address
Card <-- CardType

```

## 💻 Como Rodar?

1. Clone o repositório

```bash
git clone https://github.com/Arawns1/projeto-final-santander-dev-week-2023.git
```

2. Abra o projeto em sua IDE favorita e execute o programa

3. A documentação pode ser encontrada em:

```
http://localhost:8080/swagger-ui/index.html#/
```

Por padrão, a aplicação é iniciada em `http://localhost:8080/`


