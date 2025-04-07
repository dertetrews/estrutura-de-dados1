import java.util.Scanner;

public class Matriz12 {
    public void Inicio(){
        Scanner input = new Scanner(System.in);
        int[][] n = new int[5][5];
        int soma = 0;

        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Digite o elemento [" + L + "][" + c + "]: ");
                n[L][c] = input.nextInt();
            }
        }

        System.out.println("\nToda a matriz:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(n[L][c] + "\t");
            }
            System.out.println();
        }

        for (int L = 1; L < 5; L++) {
            for (int c = 5 - L; c < 5; c++) {
                if (n[L][c] % 2 != 0) {
                    soma += n[L][c] * n[L][c];
                }
            }
        }

        System.out.printf("\nRaiz quadrada da soma dos quadrados dos números ímpares abaixo da diagonal secundária: %.2f\n", Math.sqrt(soma));
    }
}
