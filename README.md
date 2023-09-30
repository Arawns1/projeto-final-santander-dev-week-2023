# projeto-final-santander-dev-week-2023
Api do projeto final do Bootcamp Santander dev week 2023 oferecido pela Dio.me
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
