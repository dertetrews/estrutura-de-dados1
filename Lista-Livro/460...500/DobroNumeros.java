import java.util.Scanner;

public class DobroNumeros {
    // Método para calcular o dobro de um número
    public static int calcularDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Itera sobre os três números
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Chama o método para calcular o dobro e imprime o resultado
            int dobro = calcularDobro(numero);
            System.out.println("Dobro: " + dobro);
        }

        scanner.close();
    }
}
