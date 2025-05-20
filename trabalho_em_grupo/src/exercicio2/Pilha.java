package exercicio2;

public class Pilha {
    private final int CAP = 10;
    private int topo = -1;
    private String[] elemento = new String[CAP];

    public void push(String entrada) {
        if (topo + 1 == CAP) {
            System.out.println("!!!!!!!!!!!!!!!Stack Overflow!!!!!!!!!!!!!!!");
            return;
        }
        elemento[++topo] = entrada;
    }

    public String pop() {
        if (topo < 0) {
            System.out.println("exercicio2.Pilha vazia! Não é possível remover elementos.");
            return null;
        }
        String removido = elemento[topo];
        elemento[topo--] = null;
        return removido;
    }

    public String removeAt(int idx) {
        if (idx < 0 || idx > topo) {
            System.out.println("Índice inválido!");
            return null;
        }
        String removido = elemento[idx];
        for (int i = idx; i < topo; i++) {
            elemento[i] = elemento[i + 1];
        }
        elemento[topo--] = null;
        return removido;
    }

    public void mostrar() {
        System.out.println("exercicio2.Pilha atual (fundo → topo):");
        for (int i = 0; i <= topo; i++) {
            System.out.printf("[%d]: %s\n", i, elemento[i]);
        }
    }
}
