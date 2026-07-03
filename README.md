<h1 align="center">Aula POO - Calculadora de Formas e Utilidades 🧮</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
</p>

Repositório contendo exercícios práticos de **Programação Orientada a Objetos (POO)** em Java. O sistema implementa cálculos de área para diversas figuras geométricas, além de utilitários como cálculo de IMC (Índice de Massa Corporal) e um seletor de times.

## 📋 Funcionalidades

- **Cálculo de Áreas Geométricas:**
  - ⬛ Quadrado
  - 🔵 Círculo
  - 🔺 Triângulo
  - ▭ Retângulo
  - 🔶 Losango
  - ⏢ Trapézio
- **Calculadora de IMC:** Calcula o Índice de Massa Corporal e retorna a classificação.
- **Seleção de Times:** Lógica para sorteio/seleção de equipes.

## 🗂️ Estrutura do Projeto

Os arquivos de código fonte encontram-se na pasta `src/`:
- `Main.java`: Ponto de entrada da aplicação que aciona os cálculos.
- Classes de formato (`AreaQuadrado.java`, `AreaCirculo.java`, etc.) contendo a lógica matemática.
- `IMC.java`: Classe utilitária para o cálculo de peso/altura.
- `EscolhaTime.java`: Classe utilitária para definição de times.

## 🚀 Como Executar

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone o repositório:
   ```bash
   git clone https://github.com/marcosddev/AulaPoo.git
   ```
2. Navegue até a pasta do projeto e depois para a pasta src:
   ```bash
   cd AulaPoo/src
   ```
3. Compile os arquivos Java:
   ```bash
   javac *.java
   ```
4. Execute a classe principal:
   ```bash
   java Main
   ```

---
Feito com ☕ por [Marcos Davi](https://github.com/marcosddev).
