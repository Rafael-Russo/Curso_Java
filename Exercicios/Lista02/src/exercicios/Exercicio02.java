package exercicios;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        int num, soma = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "° número inteiro: ");
            num = ler.nextInt();
            soma += num;
        }
        System.out.println("A Soma é: " + soma);
        System.out.println("A média é: " + soma/10);
    }
}
