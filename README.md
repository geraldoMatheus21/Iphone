# 📱 Simulador do Primeiro iPhone (2007) em Java

Este projeto é uma simulação do **primeiro iPhone**, lançado em 2007, utilizando os princípios da **Programação Orientada a Objetos (POO)** em Java. O objetivo é representar as funcionalidades básicas do dispositivo utilizando **interfaces** e **implementação de múltiplos comportamentos** em uma única classe concreta (`iPhone`).

## 🚀 Funcionalidades Simuladas

O `iPhone` deste projeto implementa três funcionalidades principais:

- 🎵 **Reprodutor Musical**
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`

- 📞 **Aparelho Telefônico**
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`

- 🌐 **Navegador na Internet**
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

## 🧱 Estrutura do Projeto

O projeto está dividido em interfaces e uma classe principal:

### Interfaces

- `ReprodutorMusical.java`
- `AparelhoTelefonico.java`
- `NavegadorInternet.java`

Cada interface define um conjunto de métodos públicos sem implementação, que representam os comportamentos que a classe `iPhone` deve implementar.

### Classe Principal

- `iPhone.java`: Implementa as três interfaces e define o comportamento concreto de cada método.

### Classe de Execução (opcional)

- `Main.java`: Demonstra o uso do objeto `iPhone` invocando seus métodos.

## 💡 Conceitos Trabalhados

- ✅ Interfaces em Java
- ✅ Implementação múltipla de comportamentos
- ✅ Orientação a Objetos (abstração e encapsulamento)
- ✅ Estrutura de projetos Java
- ✅ Organização e responsabilidade de código (cohesão)

## ▶️ Como Executar

1. Certifique-se de ter o **Java JDK** instalado.
2. Compile os arquivos:

```bash
javac *.java
