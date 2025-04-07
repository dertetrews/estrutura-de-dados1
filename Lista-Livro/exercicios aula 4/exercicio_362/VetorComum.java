import java.util.Scanner;

public class VetorComum {
    public void Inicio(){
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[20];
        int[] vetc = new int[10]; // no máximo 10 elementos comuns
        int L = 0;

        System.out.println("Entrada de dados do vetor 1 (10 elementos):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vet1[i] = scanner.nextInt();
        }

        System.out.println("Entrada de dados do vetor 2 (20 elementos):");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vet2[i] = scanner.nextInt();
        }

        // Inicializar vetc com valor que nunca será inserido
        for (int i = 0; i < 10; i++) {
            vetc[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < 10; i++) {
            for (int c = 0; c < 20; c++) {
                if (vet1[i] == vet2[c]) {
                    boolean repetido = false;
                    for (int d = 0; d < L; d++) {
                        if (vet1[i] == vetc[d]) {
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido) {
                        vetc[L] = vet1[i];
                        L++;
                    }
                    break; // achou igual, pode parar
                }
            }
        }

        if (L > 0) {
            System.out.println("\nElementos comuns:");
            for (int i = 0; i < L; i++) {
                System.out.println(vetc[i]);
            }
        } else {
            System.out.println("\nNão existem elementos comuns.");
        }

        scanner.close();
    }
}
