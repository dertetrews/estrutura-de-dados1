import java.util.Scanner;

public class ReservaVoos {
    public void Inicio(){
        Scanner scanner = new Scanner(System.in);
        final int MAX_VOOS = 1000;

        String[] codigosVoos = new String[MAX_VOOS];
        int[] lugares = new int[MAX_VOOS];
        int nv;

        System.out.print("Entre com o número de voos: ");
        nv = scanner.nextInt();
        scanner.nextLine(); // Limpar o \n

        for (int i = 0; i < nv; i++) {
            System.out.print("Identificação do voo " + (i + 1) + ": ");
            codigosVoos[i] = scanner.nextLine();

            System.out.print("Quantidade de lugares disponíveis no voo " + codigosVoos[i] + ": ");
            lugares[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar o \n
        }

        String vooDesejado;
        System.out.print("\nEntre com o número do voo desejado ou 0 para terminar: ");
        vooDesejado = scanner.nextLine();

        while (!vooDesejado.equals("0")) {
            int i = 0;
            while (i < nv && !codigosVoos[i].equals(vooDesejado)) {
                i++;
            }

            if (i < nv && codigosVoos[i].equals(vooDesejado)) {
                if (lugares[i] > 0) {
                    lugares[i]--;
                    System.out.print("Qual o número da identidade do cliente? ");
                    String identidade = scanner.nextLine();
                    System.out.println("Identidade: " + identidade + " | Voo: " + vooDesejado);
                } else {
                    System.out.println("Não existem mais lugares neste voo.");
                }
            } else {
                System.out.println("Não existe este voo.");
            }

            System.out.print("\nEntre com o número do voo desejado ou 0 para terminar: ");
            vooDesejado = scanner.nextLine();
        }

        System.out.println("\nEncerrando sistema de reservas...");
        scanner.close();
    }
}
