import java.util.Scanner;

public class MenuVetores {
    static final int TAM = 5;
    static int[] vetorA = new int[TAM];
    static int[] vetorB = new int[TAM];
    static boolean preenchidoA = false;
    static boolean preenchidoB = false;

    public void Inicio(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nVETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    entrada(scanner, vetorA, "A");
                    preenchidoA = true;
                    break;
                case 2:
                    entrada(scanner, vetorB, "B");
                    preenchidoB = true;
                    break;
                case 3:
                    if (preenchidoA && preenchidoB) {
                        imprime(vetorA, "A");
                        imprime(vetorB, "B");
                    } else {
                        System.out.println("Escolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if (preenchidoA && preenchidoB) {
                        soma(vetorA, vetorB);
                    } else {
                        System.out.println("Escolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if (preenchidoA && preenchidoB) {
                        subtrai(vetorA, vetorB);
                    } else {
                        System.out.println("Escolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do Algoritmo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 6);

        scanner.close();
    }

    static void entrada(Scanner scanner, int[] vetor, String nome) {
        System.out.println("Entrada do VETOR " + nome);
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    static void imprime(int[] vetor, String nome) {
        System.out.println("VETOR " + nome + ":");
        for (int i = 0; i < TAM; i++) {
            System.out.println(vetor[i]);
        }
    }

    static void soma(int[] a, int[] b) {
        System.out.println("SOMA:");
        for (int i = 0; i < TAM; i++) {
            System.out.println(a[i] + b[i]);
        }
    }

    static void subtrai(int[] a, int[] b) {
        System.out.println("DIFERENCA:");
        for (int i = 0; i < TAM; i++) {
            System.out.println(a[i] - b[i]);
        }
    }
}
