package exemplos;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        float nota;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        nota = ler.nextFloat();

        if(nota > 100 || nota < 0){
            System.out.println("Nota Inválida");
        } else if(nota >= 60){
            System.out.println("Aluno Aprovado");
        } else if (nota >= 40) {
            System.out.println("Aluno Recuperação");
        }else {
            System.out.println("Aluno Reprovado");
        }
    }
}