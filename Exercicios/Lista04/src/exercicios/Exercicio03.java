package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int escalar;
        Scanner ler = new Scanner(System.in);

        for (int y = 0; y < 3; y++){
            for (int z = 0; z < 3; z++){
                System.out.println("Escreva um valor: ");
                matriz[y][z] = ler.nextInt();

                System.out.print(matriz[y][z] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Digite o valor escalar: ");
        escalar = ler.nextInt();

        for (int y = 0; y < 3; y++){
            for (int z = 0; z < 3; z++){
                matriz[y][z] += escalar;
                
                System.out.print(matriz[y][z] + "\t");
            }
            System.out.print("\n");
        }

    }
}
