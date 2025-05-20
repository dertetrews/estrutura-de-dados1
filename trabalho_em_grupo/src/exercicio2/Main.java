package exercicio2;

public class Main {
    public static void main (String[] args) {
        Pilha pilha = new Pilha();
        pilha.push("abobora");
        pilha.push("abacate");
        pilha.push("geremias");
        pilha.removeAt(1);
        pilha.mostrar();
    }
}
