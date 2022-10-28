package exemplos;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        int opcao;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("------------ MENU ------------");
            System.out.println("<1> Cadastrar");
            System.out.println("<2> Excluir");
            System.out.println("<3> Sair");
            System.out.println("------------------------------");
            System.out.println("Digite uma opção: ");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu Cadastrar");
                    break;
                case 2:
                    System.out.println("Você escolheu Excluir");
                    break;
                case 3:
                    System.out.println("Você escolheu Sair");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        } while (opcao != 3);
    }
}
