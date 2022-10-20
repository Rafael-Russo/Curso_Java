package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("Números ímpares: ");

        for(int i = 0; i < 1000; i++){
            if (i%3==0){
                System.out.print(i + "\t");
            }
        }
    }
}