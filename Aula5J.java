import java.util.Random;
import java.util.Scanner;

public class Aula5J {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(1,6);
        System.out.println("Digite um numero:");
        int numero = leitura.nextInt(), pontuacao = 30;
        if (numero == sorteio ) {
            System.out.println("Você acertou com " + pontuacao + " pontos");
            leitura.close();
            return;
        } else {
            pontuacao = pontuacao - 10;
            System.out.println("Você perdeu 10 pontos e está com " + pontuacao +  " pontos");
        }   
        leitura.close();
    }
}
