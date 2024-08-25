import java.util.Scanner;
import java.util.Stack;

public class PilhasDinamicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        int numero;

        do {
            System.out.print("Digite um número entre -127 e 128 (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pilhaPar.push(numero);
                } else {
                    pilhaImpar.push(numero);
                }
            }
        } while (numero != 0);

        System.out.println("\nRetirando elementos alternadamente das pilhas:");
        while (!pilhaImpar.isEmpty() && !pilhaPar.isEmpty()) {
            System.out.println("Pilha Ímpar: " + pilhaImpar.pop());
            System.out.println("Pilha Par: " + pilhaPar.pop());
        }

        if (!pilhaImpar.isEmpty()) {
            System.out.println("\nA pilha ímpar ainda possui " + pilhaImpar.size() + " elementos:");
            while (!pilhaImpar.isEmpty()) {
                System.out.println(pilhaImpar.pop());
            }
        } else if (!pilhaPar.isEmpty()) {
            System.out.println("\nA pilha par ainda possui " + pilhaPar.size() + " elementos:");
            while (!pilhaPar.isEmpty()) {
                System.out.println(pilhaPar.pop());
            }
        } else {
            System.out.println("\nAmbas as pilhas estão vazias.");
        }

        scanner.close();
    }
}
