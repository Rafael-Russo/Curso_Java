package exercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número a ser somado: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número a ser somado: ");
        num2 = ler.nextInt();
        System.out.println("Digite o terceiro número a ser somado: ");
        num3 = ler.nextInt();
        System.out.println("Digite o quarto número a ser somado: ");
        num4 = ler.nextInt();

        System.out.println("A soma dos numeros é: " + (num1 + num2 + num3 + num4));
    }
}
