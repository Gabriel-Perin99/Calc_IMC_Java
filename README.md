# Projeto Calculadora IMC JAVA

<p>
  <img alt="project image" src="/src/resources/sample.png">
</p>

##  Tecnologias:

- Java
- CSS
- Intellij IDE

## Como Utilizar:

### Intellij IDE:


Para rodar este programa diretamente no Intellij, é necessário introduzir uma linha de código que faça com que a IDE reconheça o uso da biblioteca do JAVAFX dentro dos modulos/libs. 

  Para isso ocorrer é necessário fazer a seguinte configuração:

1.  ` RUN -> Edit Configurations `
2. Clicar na opção `Modify Options` e selecionar **add VM Option**
3. No campo que irá surgir, cole o seguinte código:
 
```bash
--module-path src/resources/javafx-sdk-24.0.2/lib --add-modules javafx.controls,javafx.fxml
```
4. Rebuild
5. Pronto!

 

### Terminal:

Executando pelo SDK, pode-se usar os seguintes comandos:

1. **Compilação:**

```bash
javac --module-path src/resources/javafx-sdk-24.0.2/lib --add-modules javafx.controls,javafx.fxml -d out src/Interface.java
```

2. **Execução:** 

```bash
java --module-path src/resources/javafx-sdk-24.0.2/lib --add-modules javafx.controls,javafx.fxml -cp out Interface
```
