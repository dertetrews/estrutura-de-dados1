package Exercício1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma sequência de caracteres sem limite de máximo de tamanho: ");
        String entrada = scan.nextLine();

        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < entrada.length(); i++) {
            pilha.push(entrada.charAt(i));
        }

        System.out.print("Texto invertido: ");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();

        String textoFiltrado = "";
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (Character.isLetter(c)) {
                textoFiltrado += Character.toLowerCase(c);
            }
        }

        boolean ehPalindromo = true;
        for (int i = 0; i < textoFiltrado.length() / 2; i++) {
            if (textoFiltrado.charAt(i) != textoFiltrado.charAt(textoFiltrado.length() - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

        scan.close();
    }
}