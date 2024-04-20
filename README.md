# Atividade Sistema Bancário com Threads em Java

Este projeto consiste em um sistema bancário implementado em Java, utilizando threads para representar funcionários, clientes e lojas. O sistema realiza transações financeiras entre os clientes e as lojas, garantindo a consistência dos saldos das contas utilizando locks e monitores.

## Funcionalidades

O sistema possui as entidades:

- Funcionário: Representa os funcionários das lojas, que recebem salários e realizam investimentos.
- Cliente: Representa os clientes que realizam compras nas lojas.
- Loja: Representa as lojas onde os clientes realizam compras e os funcionários recebem seus salários.
- Conta: Representa a conta bancária de cada cliente e loja.

Além disso, o sistema inclui funcionalidades como:

- Pagamento de funcionários pelas lojas.
- Compras de clientes em diferentes lojas.
- Investimento de parte do salário dos funcionários.

## Execução

Para executar o programa, basta compilar e rodar a classe `Banco_main`. O programa criará automaticamente as instâncias de funcionários, clientes e lojas, iniciará as threads correspondentes e realizará as transações financeiras. Ao final da execução, serão exibidos os saldos finais das contas dos clientes e das lojas.

## Como Utilizar

1. Compile o código fonte Java.
2. Execute a classe `Banco_main`.
3. Aguarde a conclusão das transações e verifique os saldos finais.
