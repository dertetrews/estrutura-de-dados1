import java.util.Scanner;
import java.util.Arrays;

public class BuscaBinaria {

    public static void ordena(int[] vetor) {
        Arrays.sort(vetor);
    }

    public static int busca(int[] vetor, int tamanho, int chave) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == chave) {
                return meio; // encontrado
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public void Inicio(){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        System.out.print("Digite numero de busca: ");
        int n = scanner.nextInt();

        ordena(num);

        int c = busca(num, 10, n);


        System.out.println("\nVETOR");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + num[i]);
        }

        if (c != -1) {
            System.out.println("\nPosição no vetor: " + (c + 1));
        } else {
            System.out.println("\nNÃO ENCONTRADO");
        }

        scanner.close();
    }
}
