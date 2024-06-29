# DIO - Trilha Java Básico

## Sintaxe - Desafio

1. Crie o projeto `conta-banco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

| Atributo | Tipo | Exemplo |
| -------- | ---- | ------- |
| Número   | Inteiro | 1021 |
| Agência  | Texto | 067-8  |
| Nome do cliente | Texto | Mário Andrade |
| Saldo    | Decimal | 237.48 |

3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
    - Programa: "Por favor, digite o número da Agência !";
    - Usuário: 1021 (depois ENTER para o próximo campo);

4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
*"Olá [**Nome Cliente**], obrigado por criar uma conta em nosso banco, sua agência é [**Agencia**], conta [**Numero**] e seu saldo [**Saldo**] já está disponível para saque".*
Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
