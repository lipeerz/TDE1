import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int opcao, valor;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - INSERIR NA PILHA");
            System.out.println("2 - REMOVER DA PILHA");
            System.out.println("3 - IMPRIMIR PILHA");
            System.out.println("4 - INSERIR NA FILA");
            System.out.println("5 - REMOVER DA FILA");
            System.out.println("6 - IMPRIMIR FILA");
            System.out.println("0 - SAIR");
            System.out.print("ESCOLHA: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("DIGITE O VALOR: ");
                    valor = sc.nextInt();
                    pilha.insere(valor);
                    break;
                case 2:
                    pilha.remove();
                    break;
                case 3:
                    pilha.imprime();
                    break;
                case 4:
                    System.out.print("DIGITE O VALOR: ");
                    valor = sc.nextInt();
                    fila.insere(valor);
                    break;
                case 5:
                    fila.remove();
                    break;
                case 6:
                    fila.imprime();
                    break;
                case 0:
                    System.out.println("ENCERRANDO...");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
