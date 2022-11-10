package exercicios;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        float preco, gasto ,anos, cigarros_dia, total;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quanto tempo você fuma: ");
        anos = ler.nextFloat();
        System.out.println("Digite o numero de cigarros fumados por dia (em média):");
        cigarros_dia = ler.nextFloat();
        System.out.println("Quanto custa (em média) o maço de cigarro:");
        preco = ler.nextFloat();
        System.out.println("--------------------");

        total = anos*365*cigarros_dia;

        if (total%20 != 0){
            gasto = ((total/20)+1)*preco;
        } else {
            gasto = (total/20)*preco;
        }

        System.out.println("Número de cigarros fumados em oda vida: " + total + " unidades.");
        System.out.println("Total gasto: R$ " + gasto);
    }
}
