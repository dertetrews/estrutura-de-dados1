package Exercício6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numPositivo = random.nextInt(1000) + 1;
            fila.add(numPositivo);

            int numNegativo = (random.nextInt(1000) + 1) * -1;
            fila.add(numNegativo);
        }

        System.out.println("Tamanho inicial da fila: " + fila.size());

        while (!fila.isEmpty()) {
            int numero = fila.peek();

            if (numero > 0) {
                pilha.push(fila.remove());
            } else {
                fila.remove();

                if (!pilha.isEmpty()) {
                    System.out.println("Número removido da pilha: " + pilha.peek());
                    pilha.pop();
                } else {
                    System.out.println("Pilha vazia, não há número para remover.");
                }
            }
        }

        System.out.println("Processamento concluído!");
        System.out.println("Tamanho final da fila: " + fila.size());
        System.out.println("Tamanho final da pilha: " + pilha.size());
    }
}