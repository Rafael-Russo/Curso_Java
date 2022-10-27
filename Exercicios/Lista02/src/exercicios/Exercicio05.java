package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int pagamento, parcelas, gasto=0, soma=0;
        Scanner ler = new Scanner(System.in);

        while (gasto != -999) {
            System.out.println("Digite o Gasto do cliente: ");
            gasto = ler.nextInt();
            soma+= gasto;
        }

        System.out.println("Escolha uma forma de pagamento");
        System.out.println("1- À Vista: a vista com 10% de desconto");
        System.out.println("2- Parcelado 2x: em duas vezes (preço da etiqueta)");
        System.out.println("3- Parcelado de 3x até 10x: de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima\n" +
                "de R$ 300,00).");
        pagamento = ler.nextInt();

        switch (pagamento){
            case 1:
                System.out.println("O valor a pagar é: " + soma * 0.9);
                break;
            case 2:
                System.out.println("O valor a pagar é: " + soma);
                break;
            case 3:
                System.out.println("Digite o numero de parcelas: ");
                parcelas = ler.nextInt();
                if (parcelas > 3 && parcelas < 11 && soma > 300){
                    System.out.println("O valor de cada parcela é: " + (soma/parcelas)*1.03);
                    System.out.println("O valor de total é: " + soma*1.03);
                } else {
                    System.out.println("Valor ou número de parcelas inválido");
                }
                break;
            default:
                System.out.println("Forma de pagamento inválida");
                break;
        }

    }
}
