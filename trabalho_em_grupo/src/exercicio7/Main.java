package exercicio7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> f1 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            f1.add(random.nextInt(1000));
        }

        System.out.println("Fila original: " + f1);

        Stack<Integer> pilha = new Stack<>();

        while (!f1.isEmpty()) {
            pilha.push(f1.remove());
        }

        while (!pilha.isEmpty()) {
            f1.add(pilha.pop());
        }

        System.out.println("Fila invertida: " + f1);
    }
}