package exercicio8;

import java.util.Stack;

public class TestaPilha {
    private Stack<Integer> pilhaP;
    private Stack<Integer> pilhaN;

    public TestaPilha() {
        pilhaP = new Stack<>();
        pilhaN = new Stack<>();
    }

    public void processaNumero(int numero) {
        if (numero > 0) {
            pilhaP.push(numero);
            System.out.println("Inserindo " + numero + " na pilha P");
        } else if (numero < 0) {
            pilhaN.push(numero);
            System.out.println("Inserindo " + numero + " na pilha N");
        } else {

            int numP;
            if (pilhaP.isEmpty()) {
                numP = 0;
            } else {
                numP = pilhaP.pop();
            }

            int numN;
            if (pilhaN.isEmpty()) {
                numN = 0;
            } else {
                numN = pilhaN.pop();
            }

            System.out.println("Zero encontrado! Removendo elementos das pilhas:");
            if (numP != 0) {
                System.out.println("  Removido da pilha P: " + numP);
            } else {
                System.out.println("  Pilha P está vazia");
            }

            if (numN != 0) {
                System.out.println("  Removido da pilha N: " + numN);
            } else {
                System.out.println("  Pilha N está vazia");
            }
        }
    }

    public void exibeEstadoPilhas() {
        System.out.println("\nEstado final das pilhas:");
        System.out.println("Pilha P (positivos): " + pilhaP);
        System.out.println("Pilha N (negativos): " + pilhaN);
        System.out.println("Tamanho da pilha P: " + pilhaP.size());
        System.out.println("Tamanho da pilha N: " + pilhaN.size());
    }
}