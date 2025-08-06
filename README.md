<h1 align="center">Projeto Calculadora IMC JAVA</h1>

<p align="center">Este projeto tem como objetivo a criação de uma calculadora de Índice de Massa Corporal</p>

<p align = "center">
  <img alt="project image" src="/src/resources/sample.png">
</p>

##  Tecnologias:

- Java
- CSS

## Como Utilizar:
<h3 align="center">Intellij IDE:</h3>

<p align="center">
  Para rodar este programa diretamente no Intellij, é necessário introduzir uma linha de código que reconheça o uso da biblioteca do JAVAFX.
</p>

<p align="center">
  RUN -> Edit Configurations -> habilitar a opção: add VM Option e cole o seguinte código:
</p>

<p align="center">

```bash
--module-path src/resources/javafx-sdk-24.0.2/lib --add-modules javafx.controls,javafx.fxml
```
<p/>

 

<h3 align="center">Terminal:</h3>

<p align="center"> Caso executado pelo SDK, pode-se usar os seguintes comandos:</p>

1. **Compilação:**

```bash
javac --module-path src/resources/javafx-sdk-24.0.2/lib --add-modules javafx.controls,javafx.fxml -d out src/Interface.java
```

2. **Execução:** 

```bash
java --module-path src/resources/javafx-sdk-24.0.2/lib --add-modules javafx.controls,javafx.fxml -cp out Interface
```