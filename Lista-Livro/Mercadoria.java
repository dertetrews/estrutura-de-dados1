import java.util.Scanner;

public class Mercadoria {
    double precoCompra, precoVenda;

    public Mercadoria(double precoCompra, double precoVenda) {
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public boolean proporcionaLucro() {
        return precoVenda > precoCompra;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o preço de compra da mercadoria " + (i + 1) + ": ");
            double precoCompra = scanner.nextDouble();
            System.out.print("Digite o preço de venda da mercadoria " + (i + 1) + ": ");
            double precoVenda = scanner.nextDouble();
            scanner.nextLine(); // Consume the '\n'
            Mercadoria mercadoria = new Mercadoria(precoCompra, precoVenda);
            if (mercadoria.proporcionaLucro()) {
                contador++;
            }
        }

        System.out.println("\nQuantidade de mercadorias que proporcionam lucro: " + contador);

        scanner.close();
    }
}