package Exemplos;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] idade = new int[10];
        float soma = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Digite a idade da " + (i+1) + "ª pessoa:");
            idade[i] = ler.nextInt();

            soma += idade[i];
        }

        System.out.println("-------------------------");
        System.out.println("A média das idades é: " + (soma/10));

        for (int i = 0; i < 10; i++){
            System.out.println(idade[i]);
        }
    }
}
