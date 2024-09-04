/**
 * Faça um sistema em Java para a leitura dos nomes de 5 funcionários e em seguida mostre o nome digitado desses funcionários
 */
public class Aula3 {

    public static void main(String[] args) {
        //Estou escrevendo o meu codigo java
        java.util.Scanner leitorTexto = new java.util.Scanner(System.in); 
        System.out.println("Digite seu nome:");
        String nome = leitorTexto.nextLine();
        System.out.println(nome);
        System.out.println("Digite seu nome:");
        nome = leitorTexto.nextLine();
        System.out.println(nome);
        System.out.println("Digite seu nome:");
        nome = leitorTexto.nextLine();
        System.out.println(nome);
        System.out.println("Digite seu nome:");
        nome = leitorTexto.nextLine();
        System.out.println(nome);
        System.out.println("Digite seu nome:");
        nome = leitorTexto.nextLine();
        System.out.println(nome);
        leitorTexto.close();
    }
}