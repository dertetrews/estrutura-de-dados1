import java.util.Scanner;

public class NumeroCapicua {
    // Função para verificar se um número é capicua
    public static boolean isCapicua(int numero) {
        String numeroString = Integer.toString(numero);
        String numeroInvertido = new StringBuilder(numeroString).reverse().toString();
        return numeroString.equals(numeroInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (isCapicua(numero)) {
            System.out.println(numero + " é um número capicua");
        } else {
            System.out.println(numero + " não é um número capicua");
        }

        scanner.close();
    }
}
