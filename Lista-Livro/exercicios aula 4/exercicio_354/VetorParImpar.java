import java.util.Scanner;

public class VetorParImpar {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[15];
        public void Inicio() {
            // Entrada dos números
            for (int i = 0; i < 15; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                num[i] = scanner.nextInt();
            }

            // Saída dos números com verificação de par ou ímpar
            System.out.println("\nRELAÇÃO DOS NÚMEROS:");
            for (int i = 0; i < 15; i++) {
                System.out.print((i + 1) + " - " + num[i]);
                if (num[i] % 2 == 0) {
                    System.out.println(" é PAR");
                } else {
                    System.out.println(" é ÍMPAR");
                }
            }

            scanner.close();
        }
}
