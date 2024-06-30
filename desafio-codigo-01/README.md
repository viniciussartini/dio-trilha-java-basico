# Desafios de código - DIO Bootcamp Satander 2024

## 1. Op. Bancárias simples com `switch`

### 1.1 Descrição

Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

#### 1.1.1 Entrada

- O programa exibirá um menu com as seguintes opções:

1. Depositar
2. Sacar
3. Consultar Saldo
4. Encerrar

- O usuário escolherá uma dessas opções digitando o número correspondente.

#### 1.1.2 Saída

- Utilizando um switch, o programa realizará a operação escolhida pelo usuário.
- Se o usuário escolher:
  - 1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
  - 2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
  - 3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
  - 0: O programa encerrará, imprimindo "Programa encerrado.".

## 2. Verificação de número de conta bancária

### 2.1 Descrição

Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

#### 2.1.1 Entrada

- O programa solicitará ao usuário que digite o número da conta bancária.

#### 2.1.2 Saída

- O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
- Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
- Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, `IllegalArgumentException`) e informará que o número da conta é inválido.

## 3. Verificador de idade para conta bancária

### 3.1 Descrição

Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.

#### 3.1.1 Entrada

- O programa solicitará ao usuário que digite sua idade.

#### 3.1.2 Saída

- Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
- Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
- Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.

## 4. Verificação de cheque especial

### 4.1 Descrição

Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

#### 4.1.1 Entrada

- O programa solicitará ao usuário que informe o saldo atual da conta bancária.
- Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.

#### 4.1.2 Saída

- O programa deverá verificar se o saque ultrapassará o saldo disponível na conta.
- Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso.
- Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).
  - Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
  - Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.

## 5. Controle de saques

### 5.1 Descrição

Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

#### 5.1.1 Entrada

- O programa solicitará ao usuário que informe o limite diário de saque.
- Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

#### 5.1.2 Saída

- Utilizando um laço for, o programa iterará sobre os saques.
- Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
  - Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
  - Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
