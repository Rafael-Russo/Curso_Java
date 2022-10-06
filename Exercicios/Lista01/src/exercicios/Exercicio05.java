package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        float base;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o salário base:");
        base = ler.nextFloat();

        System.out.println("O valor de gratificação a receber é de: " + (base*0.05));
        System.out.println("O valor a pagar de impostos é: " + (base*0.07));
        System.out.println("O total do salário final é: " + (base+(base*0.05)-(base*0.07)));
    }
}
