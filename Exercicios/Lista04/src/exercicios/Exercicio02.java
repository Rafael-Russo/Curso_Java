package exercicios;
import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] altura = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Random rd = new Random();

        for (int i = 0; i < 10; i++){
            altura[i] = rd.nextInt(99);

            System.out.println(altura[i]);

            if (altura[i] > max){
                max = altura[i];
            }
            if (altura[i] < min){
                min = altura[i];
            }
        }

        System.out.printf("O maior valor é: " + max);
        System.out.printf("O menor valor é: " + min);
    }
}
