package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        int count=0, num=1;

        while(num < 100){
            if (num%2 !=0){
                System.out.println(count);
                count++;
            }
            num++;
        }
        System.out.println("Contagem dos ímpares: " + count);
    }
}
