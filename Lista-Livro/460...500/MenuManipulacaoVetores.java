import java.util.Scanner;

public class MenuManipulacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean sair = false;

        while (!sair) {
            System.out.println("VETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPÇÃO: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os dados do VETOR A:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetorA[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Digite os dados do VETOR B:");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vetorB[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("VETOR A:");
                    imprimirVetor(vetorA);
                    System.out.println("VETOR B:");
                    imprimirVetor(vetorB);
                    break;
                case 4:
                    int[] soma = somaVetores(vetorA, vetorB);
                    System.out.println("Soma dos vetores:");
                    imprimirVetor(soma);
                    break;
                case 5:
                    int[] subtracao = subtraiVetores(vetorA, vetorB); // Aqui está o erro
                    System.out.println("Subtração dos vetores:");
                    imprimirVetor(subtracao);
                    break;
                case 6:
                    sair = true;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    // Função para imprimir um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // Função para somar dois vetores
    public static int[] somaVetores(int[] vetorA, int[] vetorB) {
        int[] resultado = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            resultado[i] = vetorA[i] + vetorB[i];
        }
        return resultado;
    }
  
    // Função para subtrair dois vetores
    public static int[] subtraiVetores(int[] vetorA, int[] vetorB) {
        int[] resultado = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            resultado[i] = vetorA[i] - vetorB[i];
        }
        return resultado;
    }
}
