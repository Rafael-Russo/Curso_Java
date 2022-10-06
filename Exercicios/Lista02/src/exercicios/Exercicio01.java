package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int i;

        i = 0;

        System.out.println(i);

        while (i<1000){
            if (i%2==1 && 1%3==0){
                System.out.println("O número "+(i));
            }
            i++;
        }
    }
}
