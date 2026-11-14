# java-agenda-contatos
Aplicação de console desenvolvida em Java para praticar POO, composição de objetos e Collections Framework.

# 📒 Agenda de Contatos

Projeto desenvolvido em Java com o objetivo de praticar os fundamentos da Programação Orientada a Objetos (POO), utilizando composição de objetos e coleções para organizar contatos e seus respectivos telefones.

## 🎯 Objetivo

Desenvolver uma aplicação de console capaz de cadastrar e organizar contatos, permitindo que cada contato possua múltiplos números de telefone.

## ⚙️ Funcionalidades

- Cadastro de uma agenda.
- Cadastro de contatos com nome e email.
- Associação de múltiplos telefones a cada contato.
- Limitação de até dois telefones por contato.
- Validação dos dados informados.
- Exibição dos contatos cadastrados e seus respectivos telefones.

## 🧩 Conceitos de Java aplicados

Durante o desenvolvimento foram praticados os seguintes conceitos:

- **Programação Orientada a Objetos:** criação de classes e instâncias.
- **Composição de objetos:** relacionamento entre Agenda, Contato e Telefone.
- **Encapsulamento:** utilização de atributos privados e métodos de acesso.
- **Collections Framework:** utilização de `List` e `ArrayList`.
- **Sobrescrita de métodos:** implementação de `toString()`, `equals()` e `hashCode()`.
- **Tratamento de exceções:** utilização de `IllegalArgumentException` para validação dos dados.
- **Laços de repetição:** iteração sobre coleções.
- **StringBuilder:** construção de representações textuais dos contatos.

## 🏗️ Estrutura do projeto

- `Agenda`: administra a coleção de contatos.
- `Contato`: armazena os dados pessoais e administra a coleção de telefones.
- `Telefone`: representa um número de telefone e realiza sua validação.
- `Teste`: executa a aplicação e realiza a entrada de dados pelo console.

## 🛠️ Tecnologias utilizadas

- Java
- Java Collections Framework
- Eclipse IDE

## 📚 Aprendizado

Este projeto faz parte dos meus estudos em Java e representa uma etapa de aprendizado sobre relacionamentos entre objetos, composição e organização de responsabilidades entre classes.

O desenvolvimento permitiu compreender, na prática, como diferentes objetos podem colaborar para construir uma aplicação organizada e funcional.
