import java.util.Scanner;
import java.util.Arrays;

public class MenuVetorFuncao {
    static final int TAMANHO = 5;
    static int[] vetor = new int[TAMANHO];
    static boolean preenchido = false;

    public void Inicio(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    entrada(scanner);
                    preenchido = true;
                    break;
                case 2:
                    if (preenchido) {
                        ordena();
                    } else {
                        System.out.println("Escolha primeiro a opção 1");
                    }
                    break;
                case 3:
                    if (preenchido) {
                        imprime();
                    } else {
                        System.out.println("Escolha primeiro a opção 1");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do algoritmo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);

        scanner.close();
    }

    static void entrada(Scanner scanner) {
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    static void ordena() {
        Arrays.sort(vetor); // usa sort pronto
        System.out.println("Vetor ordenado com sucesso.");
    }

    static void imprime() {
        System.out.println("\nVETOR:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }
}
