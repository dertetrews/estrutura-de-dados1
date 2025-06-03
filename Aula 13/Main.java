import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(19999) - 9999;
        }

        System.out.println("Vetor:");
        for (int num : vetor) {
            System.out.print(num + " ");
            lista.inserirOrdenado(num);
        }

        System.out.println("\n\nLista em ordem crescente:");
        lista.displayForward();

        System.out.println("\nLista em ordem decrescente:");
        lista.displayBackward();

        lista.removerPrimos();

        System.out.println("\nLista após remoção dos primos:");
        lista.displayForward();
    }
}
