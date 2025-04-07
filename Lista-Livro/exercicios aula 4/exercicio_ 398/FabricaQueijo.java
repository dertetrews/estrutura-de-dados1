import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class FabricaQueijo {
    public void Inicio(){
        final int MAX_PRODUTOS = 50;
        int[] codigos = new int[MAX_PRODUTOS];
        int[] quantidades = new int[MAX_PRODUTOS];
        double[] precos = new double[MAX_PRODUTOS];

        int k = 0;
        double totalVendido = 0.0;

        Scanner scanner = new Scanner(System.in);

        // Cadastro de produtos
        System.out.print("Digite o código do produto ou -1 para terminar: ");
        int codigo = scanner.nextInt();
        while (codigo != -1 && k < MAX_PRODUTOS) {
            codigos[k] = codigo;
            System.out.print("Digite a quantidade disponível: ");
            quantidades[k] = scanner.nextInt();
            System.out.print("Digite o preço do produto: ");
            precos[k] = scanner.nextDouble();
            k++;
            if (k < MAX_PRODUTOS) {
                System.out.print("\nDigite o código do próximo produto ou -1 para terminar: ");
                codigo = scanner.nextInt();
            } else {
                System.out.println("Limite de produtos atingido!");
            }
        }

        // Fase de vendas
        System.out.print("\nDigite o código do produto para venda ou 0 para terminar: ");
        codigo = scanner.nextInt();
        while (codigo != 0) {
            int i = 0;
            while (i < k && codigos[i] != codigo) {
                i++;
            }

            if (i == k) {
                System.out.println("Produto Não-Cadastrado");
            } else {
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                if (quantidades[i] >= quantidade) {
                    quantidades[i] -= quantidade;
                    double valor = quantidade * precos[i];
                    totalVendido += valor;
                    System.out.printf("Venda realizada! Total: R$ %.2f\n", valor);
                } else {
                    System.out.println("Estoque Insuficiente");
                }
            }

            System.out.print("\nDigite o código do produto para nova venda ou 0 para terminar: ");
            codigo = scanner.nextInt();
        }

        // Listagem final
        System.out.printf("\nTotal vendido no dia: R$ %.2f\n", totalVendido);
        System.out.println("Estoque final (ordenado por quantidade decrescente):");

        // Criar um array de índices para ordenação
        Integer[] indices = new Integer[k];
        for (int i = 0; i < k; i++) {
            indices[i] = i;
        }

        // Ordenar os índices com base nas quantidades decrescentes
        Arrays.sort(indices, Comparator.comparingInt((Integer i) -> quantidades[i]).reversed());

        System.out.printf("%-10s %-10s %-10s\n", "CÓDIGO", "QUANT.", "PREÇO");
        for (int i : indices) {
            System.out.printf("%-10d %-10d R$ %-10.2f\n", codigos[i], quantidades[i], precos[i]);
        }

        scanner.close();
    }
}
