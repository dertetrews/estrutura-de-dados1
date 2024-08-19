import java.util.Random;

public class ListaCircularComSentinela {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[1000];
        ListaCircularDuplamenteEncadeada lista = new ListaCircularDuplamenteEncadeada();

        // Passo 1: Gerar e imprimir números aleatórios
        System.out.print("Vetor => ");
        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(19999) - 9999;
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Passo 2: Inserir os números na lista encadeada de forma ordenada
        for (int num : vetor) {
            lista.inserirOrdenado(num);
        }

        // Passo 3: Imprimir a lista em ordem crescente
        System.out.print("Lista em ordem crescente => ");
        lista.imprimirCrescente();

        // Passo 4: Imprimir a lista em ordem decrescente
        System.out.print("Lista em ordem decrescente => ");
        lista.imprimirDecrescente();

        // Passo 5: Remover os números primos e imprimir novamente
        lista.removerPrimos();
        System.out.print("Lista após remover primos => ");
        lista.imprimirCrescente();
    }
}