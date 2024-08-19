class ListaCircularDuplamenteEncadeada {
    private Node sentinela;

    public ListaCircularDuplamenteEncadeada() {
        sentinela = new Node(0);  // nó sentinela
        sentinela.next = sentinela;
        sentinela.prev = sentinela;
    }

    public void inserirOrdenado(int valor) {
        Node novo = new Node(valor);
        Node atual = sentinela.next;

        while (atual != sentinela && atual.value < valor) {
            atual = atual.next;
        }

        novo.next = atual;
        novo.prev = atual.prev;
        atual.prev.next = novo;
        atual.prev = novo;
    }

    public void imprimirCrescente() {
        Node atual = sentinela.next;
        while (atual != sentinela) {
            System.out.print(atual.value + " ");
            atual = atual.next;
        }
        System.out.println();
    }

    public void imprimirDecrescente() {
        Node atual = sentinela.prev;
        while (atual != sentinela) {
            System.out.print(atual.value + " ");
            atual = atual.prev;
        }
        System.out.println();
    }

    public void removerPrimos() {
        Node atual = sentinela.next;
        while (atual != sentinela) {
            if (ehPrimo(atual.value)) {
                atual.prev.next = atual.next;
                atual.next.prev = atual.prev;
            }
            atual = atual.next;
        }
    }

    private boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}