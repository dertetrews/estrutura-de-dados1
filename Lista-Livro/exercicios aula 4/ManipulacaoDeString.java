import java.util.Scanner;

public class ManipulacaoDeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String frase;

        do {
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome o '\n'

            switch (opcao) {
                case 1:
                    System.out.print("Digite uma frase: ");
                    frase = scanner.nextLine();
                    System.out.println("O comprimento da frase é: " + frase.length());
                    break;
                case 2:
                    System.out.print("Digite uma frase: ");
                    frase = scanner.nextLine();
                    if (frase.length() >= 4) {
                        String primeiroDois = frase.substring(0, 2);
                        String ultimoDois = frase.substring(frase.length() - 2);
                        System.out.println("Os dois primeiros e os dois últimos caracteres são: " + primeiroDois + " " + ultimoDois);
                    } else {
                        System.out.println("A frase é muito curta para ter dois caracteres no início e no fim.");
                    }
                    break;
                case 3:
                    System.out.print("Digite uma frase: ");
                    frase = scanner.nextLine();
                    String reversa = "";
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        reversa += frase.charAt(i);
                    }
                    System.out.println("A frase espelhada é: " + reversa);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}