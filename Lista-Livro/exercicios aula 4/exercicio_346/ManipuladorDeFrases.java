import java.util.Scanner;

public class ManipuladorDeFrases {
    private Scanner scanner;

    public ManipuladorDeFrases() {
        scanner = new Scanner(System.in);
    }

    public void executarMenu() {
        int op;
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPÇÃO: ");
            op = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (op >= 1 && op <= 3) {
                System.out.print("Digite uma frase: ");
                String frase = scanner.nextLine();
                processarOpcao(op, frase);
            } else if (op == 4) {
                System.out.println("Fim do algoritmo.");
            } else {
                System.out.println("Opção não disponível.");
            }
        } while (op != 4);
    }

    private void processarOpcao(int op, String frase) {
        switch (op) {
            case 1:
                System.out.println("Número de caracteres da frase: " + frase.length());
                break;
            case 2:
                if (frase.length() < 2) {
                    System.out.println("A frase deve ter pelo menos 2 caracteres.");
                } else {
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                    System.out.println("Os dois últimos caracteres: " + frase.substring(frase.length() - 2));
                }
                break;
            case 3:
                System.out.println("Frase espelhada: " + new StringBuilder(frase).reverse());
                break;
        }
    }
}
