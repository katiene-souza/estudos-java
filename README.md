# Linguaguem Java 

## Conceitos de programação
Antes de falar sobre a linguagem proprapriamente dita, acho importante trazer algumas informações e conceitod importantes que soma muito no aprendizado. 

### Linguagem de alto nível vs. baixo nível

As linguagens de alto nível, em linhas gerais, são caracterizadas por uma sintaxe que visa facilitar a compreensão humana, graças a um nível mais elevado de abstração. Essa característica torna tais linguagens intuitivas, de fácil assimilação e aprendizado. Exemplos notáveis de linguagens de alto nível incluem Java, C#, JavaScript, entre outras.

Em contrapartida, as linguagens de baixo nível são desenvolvidas para a compreensão direta da máquina, apresentando uma sintaxe mais complexa que pode ser desafiadora para os humanos compreenderem. Elas possuem instruções mais diretas para o processador, priorizando a eficiência em detrimento da facilidade de leitura. Um exemplo proeminente de linguagem de baixo nível é o Assembly.

### Diferenças entre linguagem interpretada e compilada

## Sobre a linguaguem Java
Criada pela MicroSystem e desenvolvida em 1990 por James Gosling e sua equipe, em 2008 ela foi comprada pela Oracle. A intenção era criar uma linguagem de programação que fosse portátil, ou seja, capaz de ser executada em diferentes tipos de dispositivos, independentemente da arquitetura de hardware. Java é uma linguagem orientada a objetos, o que permite uma modelagem de software eficiente e modular. Ela pode ser interpretada por todos os sistemas operacionais e mantém compatibilidade com as versões anteriores, além disso a linguaguem Java é fortemente tipada.

## Versões do Java

Para se manter atualizado sobre as versões do Java, é possível consultar o site oficial da [Oracle](https://www.oracle.com/java/technologies/java-se-glance.html). Similar a várias outras linguagens de programação, o Java segue um modelo de lançamento que inclui versões menores e LTS (Long-Term Support, ou suporte de longo prazo). Até a presente data desta documentação, a versão LTS vigente é o Java 21. Recomenda-se verificar regularmente o site da Oracle para obter as informações mais recentes sobre as versões disponíveis.

A linguagem Java é acompanhada por um abrangente Kit de Desenvolvimento, o qual deve ser baixado em conjunto com a instalação do Java. Sendo uma plataforma completa para desenvolvimento e execução, o Java inclui não apenas o essencial ambiente de execução, mas também um rico conjunto de Bibliotecas (API - Interfaces de Programação de Aplicações) que oferecem amplas funcionalidades prontas para serem utilizadas. Este ambiente de execução proporciona a capacidade fundamental para a execução de programas desenvolvidos na linguagem Java, tornando-a uma solução robusta e completa para a criação de aplicações diversas.

## JDK / JVM 

### JDK (Java Development Kit ou Kit de desenvolvimento Java) 
O JDK (Java Development Kit) é um conjunto de ferramentas de desenvolvimento de software usado para desenvolver aplicações Java. Ele inclui diversas utilidades e recursos que são essenciais para a criação, compilação, depuração e execução de programas Java. O JDK fornece tudo o que é necessário para desenvolver aplicações Java, desde o código-fonte até a execução.

### JVM (Java Virtual Machine ou Máquina virtual Java)
Ela realiza a execução de sistemas desenvolvidos em Java e é utilizada pelo desenvolvedor durante o processo de criação de aplicações. No cenário em que um sistema é desenvolvido para um cliente, é essencial instalar a Java Virtual Machine (JVM) na máquina do cliente para assegurar a execução do aplicativo.

O JVM aprimora a portabilidade do Java ao adotar uma abordagem híbrida, combinando técnicas de compilação e interpretação. Essa estratégia possibilita a execução da aplicação em diversos sistemas operacionais, eliminando a necessidade de recompilação ou ajustes. Um exemplo prático disso é:

![Imagem de explicação do JVM](https://github.com/katiene-souza/estudos-java/assets/85809975/9350e025-79ef-4b76-9b3f-57fbe91551a6)

O **Bytecode** é uma representação intermediária do código, compilada com a garantia de precisão e correção. Esse código é projetado para ser executado sobre uma Máquina Virtual Java (JVM), proporcionando a flexibilidade de funcionar em qualquer instância das máquinas virtuais disponíveis. Essa abordagem confere uma camada adicional de portabilidade, permitindo que os programas escritos em Java sejam executados em diversas plataformas sem a necessidade de recompilação, desde que haja uma JVM compatível disponível.

## Conceitos básicos do Java

### Váriaveis 
As variáveis atuam como "recipientes" essenciais para o armazenamento e manipulação de dados em programas de computador. Elas mantêm valores em regiões específicas da memória RAM, reservadas para armazenar dados durante a execução do programa. Esses valores podem ser posteriormente acessados por meio dos nomes atribuídos a cada variável, proporcionando uma maneira estruturada e eficiente de lidar com informações ao longo da execução do código. 

O java é uma linguagem fortemente tipada, então a sintaxe para declarar variáveis é feita da seguinte forma: 
```java
  <tipo> <nome> = <valor inicial>; // o valor inicial é opcional, mas o ponto e vírgula depois da declaração é obrigatória. 
```
#### tipos primitivos da linguagem Java
Como Java é uma linguagem fortemente tipada, as variáveis precisam ser declaradas com um tipo específico, esses são os principais tipos:
- **Tipos Primitivos:** 
  - `int`: Armazena um número inteiro
      ```java
        int idade = 21; 
      ```
  - `double`: Armazena números de ponto flutuante de dupla precisão e ocupa 64 bytes na memória.
      ```java
        double altura = 1.63353; 
      ```
  - `float`: Armazena números de ponto flutuante de precisão simples e ocupa 32 bytes na memória. Nota-se que é obrigatório adicionar o sufixo `f` para indicar que é um float.
      ```java
        float altura = 1.63f; 
      ```
  - `char`: Armaneza somente um caractere.
      ```java
        char sexo = 'F'; 
      ```
  - `byte`: Armazena números inteiros pequenos.
      ```java
        byte numeroPequeno = 127;  
      ```
  - `short`: Armazena números inteiros curtos.
      ```java
        short numeroCurto = 32000;  
      ```
  - `long`: Armanzena números inteiros longos.
      ```java
        long numeroLongo = 1234567890L;  
      ```
  - `boolean`: Armazena valores verdeiros e falsos.
      ```java
        boolean maiorDeIdade = false; 
      ```
- **Tipos de referência(Objetos):** Os tipos de referência são todos nomeados com a primeira letra maiúscula e é obrigatório. 
  - `String`: Armazena sequência de caracteres.
      ```java
        String nome = 'Katiene Souza';  
      ```
  - `Array:` Estruturas que armazenam conjuntos de elementos do mesmo tipo.
    ```java
      int[] arrayNumeros = {1, 2, 3, 4, 5}; 
    ```
  - `Classes e Objetos:` Java é uma linguagem orientada a objetos, e os programadores podem criar suas próprias classes e objetos. Mas, falaremos sobre isso mais tarde.
  - 
  
