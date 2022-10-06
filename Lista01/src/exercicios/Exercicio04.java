package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float salario, aumento;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o salário:");
        salario = ler.nextFloat();
        System.out.println("Digite a porcentagem de aumento:");
        aumento = (ler.nextFloat()/100)+1;

        System.out.println("O Salário com o aumento de 25% é: R$ " + (salario * aumento));
        System.out.println("O salário aumentou em: R$ " + salario * (aumento - 1));
    }
}