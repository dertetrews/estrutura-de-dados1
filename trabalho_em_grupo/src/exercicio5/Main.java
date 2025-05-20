package Exercício5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> F = new LinkedList<>();
        Stack<Integer> P = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(1000);

            boolean numeroJaExiste = false;
            for (Integer n : F) {
                if (n.equals(numero)) {
                    numeroJaExiste = true;
                    break;
                }
            }

            if (numeroJaExiste) {
                P.push(numero);
            } else {
                F.add(numero);
            }
        }

        System.out.println("Fila F: " + F);
        System.out.println("Pilha P: " + P);
    }
}