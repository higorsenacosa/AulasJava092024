public class Aula7A {
    public static void main(String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        java.util.Scanner leitura = new java.util.Scanner(System.in);
        final int sorteio = aleatorio.nextInt(1,6);
        System.out.println("Digite um numero:");
        int pontuacao = 50;
        int numero;
        while(pontuacao>0){
            numero = leitura.nextInt();
            if (sorteio < numero) {
                //pontuacao = pontuacao - 10;
                pontuacao -= 10;
                System.out.println("Numero digitado é maior e você está com " + pontuacao + " pontos");
            } else if(sorteio > numero){
                pontuacao -= 10;
                System.out.println("Numero digitado é menor que o numero sorteado e você está com " + pontuacao + " pontos");
            } else{
                System.out.println("Você acertou com " + pontuacao + " pontos");
                return;
            }
        }
        System.out.println("Você perdeu :(");
        leitura.close();
    }
}
