package exercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int opcao, votoA=0, votoB=0;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("--------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Voto candidato A");
            System.out.println("2 - Voto candidato B");
            System.out.println("3 - Apurar resultado");
            System.out.println("4 - Sair");
            System.out.println("--------------------");

            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Voto no candidato A com sucesso.");
                    votoA++;
                    break;
                case 2:
                    System.out.println("Voto no candidato B com sucesso.");
                    votoB++;
                    break;
                case 3:
                    if (votoA > votoB) {
                        System.out.println("Vencedor: Candidato A");
                    } else if (votoB > votoA) {
                        System.out.println("Vencedor: Candidato B");
                    } else {
                        System.out.println("Empate!");
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}
