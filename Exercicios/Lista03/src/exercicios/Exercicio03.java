package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int idade, altura, sexo=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite sua altura (em centimetros): ");
        altura = ler.nextInt();
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Feminino");
        System.out.println("2 - Masculino");

        while (ler.nextInt() != 1 || ler.nextInt() != 2){
            if (ler.nextInt() == 1 || ler.nextInt() == 2){
                sexo = ler.nextInt();
            }else {
                System.out.println("Opção inválida");
            }
        }

        if (altura >= 180 && idade > 16 && sexo == 1){
            System.out.println("apto a jogar no time Feminino Juvenil de Basquete");
        } else if (altura >= 180 && idade > 16 && sexo == 2){
            System.out.println(" apto a jogar no time Masculino Juvenil de Basquete");
        }else {
            System.out.println("Não apto");
        }
    }
}
