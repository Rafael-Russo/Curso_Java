package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float raio;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        raio = ler.nextFloat();

        System.out.println("O valor do perimetro é igual a: " + (2*3.1415*raio));
        System.out.println("O valor da area é igual a: " + (3.1415*(raio*raio)));
    }
}