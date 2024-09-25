# Repositorio das aulas

Este repositorio serve para nossas aulas

# Instalando e configurando para casa o VSCode e Zulu
Para realizar a instalação, abra o powershell em sua casa e execute esse comando
```powershell
winget install Azul.Zulu.22.JDK
winget install Microsoft.VisualStudioCode
```

# Exercicios de 04/09/2024
Faça um sistema em Java para a leitura dos nomes de 5 funcionários e em seguida mostre o nome digitado desses funcionários

# Exercicios de 09/09/2024
1. Crie um programa em Java que leia o nome do aluno e suas 5 notas, e ao final, retorne sua nota média.
2. Calcule a soma das médias dos 5 estudantes e, ao final, retorne essa soma e os nomes dos estudantes.
3. Desenvolva um programa em Java que leia informações de 5 produtos: nome, quantidade e preço unitário. Calcule o preço total de cada produto e, ao final, retorne a soma total de todos os produtos e os nomes de todos os produtos registrados.

# Exercícios de 11/09/2024
1. Identifique os erros do código e corrija-os:
```java
public class Main {public static void main(String[] args) {int a=5b=10,c c=+ab;System.out.println(c);}}
```
2. Calcule a soma das médias dos 5 estudantes e, ao final, informe se cada estudante foi aprovado ou reprovado (considere que a média de aprovação deve ser maior ou igual a 6).
3. Crie um sistema que leia a temperatura em graus Celsius e determine se ela é quente ou fria.
4. Desenvolva um programa em Java que verifique se uma pessoa é maior ou menor de idade.

# Exercícios de 16/09/2024
1. Crie um programa em Java que, ao receber um estado do usuário como entrada, exiba uma ou mais cidades pertencentes ao estado selecionado.

# Exercícios de 18/09/2024
1. Onde fecha cada if, else if e else?
```java
public class ExemploIfEncadeado {
    public static void main(String[] args) {
        int nota = 85; // Alterar valor para testar

        if (nota >= 70) { // Início do primeiro if
            System.out.println("Nota suficiente."); // Linha 1
            
        if (nota >= 90) { // Início do segundo if
                System.out.println("Você tirou um A."); // Linha 2
                
        if (nota == 100) { // Início do terceiro if
                    System.out.println("Parabéns, nota máxima!"); // Linha 3
        } // Fim do terceiro if
        } else if (nota >= 80) { // Início do else if
                    System.out.println("Você tirou um B."); // Linha 4
        if (nota >= 85) { // Início do quarto if
                    System.out.println("Muito bom, quase um A!"); // Linha 5
        } // Fim do quarto if
        } else { // Início do else
                    System.out.println("Você tirou um C."); // Linha 6
        } // Fim do else
        } else { // Início do else
            System.out.println("Nota insuficiente."); // Linha 7
        } // Fim do primeiro if
    } // Fim do método main
} // Fim da classe

```
Informe como no exemplo:
O primeiro if fecha após a linha que imprime "Nota insuficiente."

2. Calcule a média das duas notas de um estudante.
3. Crie um sistema que leia a temperatura e faça a conversão para:

    Fahrenheit para Celsius:
    ```math
    °F = \left( °C \times \frac{9}{5} \right) + 32
    ```


   Celsius para Fahrenheit
   ```math
    °C = \left( °F - 32 \right) \times \frac{5}{9}
   ```
   
5. Desenvolva um programa em Java que verifique se uma pessoa é maior ou menor de idade, ainda se já é idoso ou não.
6. Como configurar o Codespaces para rodar a versão 22 do Azul Zulu?
7. Desenvolva um programa em Java para classificar times de futebol pelos estados do Brasil.
Exemplo: Time do São Paulo → Estado de São Paulo
8. Crie um sistema que leia o dia da semana (1-7) e informe o dia correspondente.
9. Desenvolva um sistema que leia a quantidade de produtos e o valor unitário, retornando o valor total.
10. Implemente um programa que some valores inseridos pelo usuário até que ele digite 0, parando de rodar o programa.
11. Localize e ajuste os erros no código abaixo:
    ```java
    public class CheckNumber {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive")
        else {
            System.out.println("Number is negative or zero";
        }

        if (number < 5
            System.out.println("Number is less than 5");
        } else {
            System.out.println("Number is 5 or more);
        }
    }
    }
    ```

# Exercícios de 23/09/2024
1. A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmo para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:

a. Média de salário da população; 

b. Média do número de filhos; 

c. Maior salário dos habitantes; 

d. Percentual de pessoas com salário menor que R$ 150,00

Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”. 

2. Crie um programa em Java que imprima a tabuada do 2, até 100 vezes.
3. Crie um sistema em Java para a leitura dos 30 usuários na empresa Davi's Model.
4. Crie um programa em Java que imprima apenas os múltiplos de 3 e 7, até 100 vezes. 
5. Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram.


