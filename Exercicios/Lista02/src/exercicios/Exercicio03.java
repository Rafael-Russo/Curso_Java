package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float largura, comprimento, soma = 0;

        for (int i = 1; i < 5; i++){
            System.out.println("Digite a largura do " + i + "° cômodo:");
            largura = ler.nextFloat();
            System.out.println("Digite a largura do " + i + "° cômodo:");
            comprimento = ler.nextFloat();
            soma += largura * comprimento;
        }

        System.out.println("A área total dos 4 cômodos é: " + soma);
    }
}
