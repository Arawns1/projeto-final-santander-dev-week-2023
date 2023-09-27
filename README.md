# projeto-final-santander-dev-week-2023
Api do projeto final do Bootcamp Santander dev week 2023 oferecido pela Dio.me
```mermaid
classDiagram
  class Account {
    +id: string
    +number: string
    +agency: number
    +balance: number
    +limit: number
  }
  
  class Card {
    +number: number
    +type: string
    +limit: number
    +account: string
  }
  
  class Client {
    +cpf: string
    +name: string
    +complement: string
    +number: string
    +address: Address
  }
  
  class Address {
    +id: string
    +cep: string
    +street: string
    +district: string
    +city: string
    +uf: string
  }
  
  class PaymentMethod {
    +id: string
    +icon: string
    +description: string
  }
  
  Account <-- "1" *-- "1" Client
  Account <-- "1" *-- "1" Card
  Account <-- "1" *-- "1" PaymentMethod

```
