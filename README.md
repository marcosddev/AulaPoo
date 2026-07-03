# Projeto Prático de Programação Orientada a Objetos (POO) em Java

Este repositório contém uma aplicação desenvolvida em Java puro com o objetivo de demonstrar os fundamentos da Programação Orientada a Objetos (POO). O projeto engloba cálculos matemáticos para áreas de figuras geométricas, rotinas de saúde (como o cálculo de IMC) e lógicas de estruturação e sorteio para seleção de times.

O foco deste projeto é evidenciar o encapsulamento, a separação de responsabilidades e a aplicação de boas práticas de design e organização de código em Java.

## Funcionalidades Implementadas

* **Módulo de Geometria:**
  * Implementação de classes específicas para o cálculo preciso de áreas de diversas figuras planas.
  * Suporte para: Quadrado, Círculo, Triângulo, Retângulo, Losango e Trapézio.
* **Módulo de Saúde (IMC):**
  * Classe dedicada ao processamento do Índice de Massa Corporal.
  * Implementa as regras de negócio para classificação baseada nas diretrizes padrão da Organização Mundial da Saúde (OMS).
* **Módulo de Utilitários (Seleção de Times):**
  * Rotina focada na lógica de randomização e distribuição equitativa de dados para alocação de participantes em grupos/times.

## Estrutura e Arquitetura do Projeto

A organização dos diretórios e arquivos foi planejada para garantir escalabilidade, legibilidade e fácil manutenção.

```text
AulaPoo/
│
├── src/
│   ├── Main.java               # Classe principal, atua como ponto de entrada e orquestração do sistema
│   ├── AreaCirculo.java        # Regras de negócio e cálculo matemático para círculos
│   ├── AreaLosango.java        # Regras de negócio e cálculo matemático para losangos
│   ├── AreaQuadrado.java       # Regras de negócio e cálculo matemático para quadrados
│   ├── AreaRetangulo.java      # Regras de negócio e cálculo matemático para retângulos
│   ├── AreaTrapezio.java       # Regras de negócio e cálculo matemático para trapézios
│   ├── AreaTriangulo.java      # Regras de negócio e cálculo matemático para triângulos
│   ├── EscolhaTime.java        # Lógica de distribuição e seleção de membros para times
│   └── IMC.java                # Algoritmo de cálculo e classificação do Índice de Massa Corporal
│
├── .gitignore                  # Regras de exclusão para arquivos gerados na compilação (.class, IDEs, etc)
└── README.md                   # Documentação principal e instruções do projeto
