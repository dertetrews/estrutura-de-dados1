class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }

    public void push(char c) {
        No novo = new No(c);
        novo.proximo = topo;
        topo = novo;
    }

    public char pop() {
        if (isEmpty()) throw new RuntimeException("Pilha vazia");
        char c = topo.dado;
        topo = topo.proximo;
        return c;
    }

    public boolean isEmpty() {
        return topo == null;
    }
}
