package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        float salario;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o salário:");
        salario = ler.nextFloat();

        System.out.println("O Salário com o aumento de 25% é: " + (salario * 1.25));
    }
}