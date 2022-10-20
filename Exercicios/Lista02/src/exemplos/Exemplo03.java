package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i<=100; i++){
            if (i%2 == 0 || i%3 == 0){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("");
        System.out.println("A quantidade de números multiplos de 2 e 3 é: " + count);
    }
}