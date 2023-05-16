import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int segredo = new Random().nextInt(100);
        int tentativas = 5;
        int chute = 0;
        System.out.println("Bem vindo ao jogo da adivinhação!");
        System.out.println("o segredo é"+ segredo);
        System.out.println("Chute um número de 1 a 100!");

        while (tentativas > 0){
            System.out.println("você tem "+ tentativas+" tentativas.");
            System.out.println("Faça o seu chute!");
            chute = leitura.nextInt();
            tentativas--;
            if (chute < segredo){
                System.out.println("Seu chute foi menor que o número secreto.");
            } else if (chute > segredo) {
                System.out.println("Seu chute foi maior que o número secreto.");
            }
            if (chute == segredo) {
                System.out.println("Parabéns, você acertou!");
                break;
            }
            else if (tentativas == 0){
                System.out.println("fim de jogo você perdeu!");
            }
        }

    }
}
