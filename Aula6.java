import java.util.Random;
import java.util.Scanner;
public class Aula6 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitura = new Scanner(System.in);
        final int sorteio = aleatorio.nextInt(1,6);
        System.out.println("Digite um numero:");
        int pontuacao = 30;
        int numero = leitura.nextInt();
        if (sorteio < numero) {
            //pontuacao = pontuacao - 10;
            pontuacao -= 10;
            System.out.println("Numero digitado é maior que o numero sorteado e você está com " + pontuacao + " pontos");
        } else if(sorteio > numero){
            pontuacao -= 10;
            System.out.println("Numero digitado é menor que o numero sorteado e você está com " + pontuacao + " pontos");
        } else{
            System.out.println("Você acerto com " + pontuacao + " pontos");
            leitura.close();
            return;
        }
        leitura.close();
    }
}
