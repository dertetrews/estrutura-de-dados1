class ListaCircularComCabeca {
    No cabeca;

    public ListaCircularComCabeca() {
        cabeca = new No(-1); // nó cabeça
        cabeca.proximo = cabeca;
    }

    public void inserir(int dado) {
        No novo = new No(dado);
        novo.proximo = cabeca.proximo;
        cabeca.proximo = novo;
    }

    public void imprimir() {
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
