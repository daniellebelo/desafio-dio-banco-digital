# Projeto Banco Digital - Bootcamp Santander Java

Este é um projeto simples de simulação de um banco digital, desenvolvido em Java como parte do Bootcamp Santander 2025 da DIO.

## Funcionalidades

- Criação de clientes com nome, endereço e telefone (desenvolvido por mim como melhoria do projeto inicial proposto pelo professor).
- Abertura de contas correntes e poupança.
- Operações básicas:
    - Depósito
    - Saque
    - Transferência entre contas
    - Impressão de extrato

## Estrutura do Projeto

- `Cliente`: classe que representa os dados de um cliente.
- `Conta` (abstrata): classe base para contas bancárias.
- `ContaCorrente` e `ContaPoupanca`: especializações da classe `Conta`.
- `Main`: classe principal onde as operações são simuladas.