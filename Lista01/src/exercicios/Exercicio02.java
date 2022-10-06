package exercicios;
import  java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        float nota1, nota2, nota3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextFloat();

        System.out.println("a média das notas é: " + ((nota1+nota2+nota3)/3));
    }
}
