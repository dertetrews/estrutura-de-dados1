class ListaComCabeca {
    No cabeca;

    public ListaComCabeca() {
        cabeca = new No(0); // Nó cabeça com dado fictício
        cabeca.proximo = cabeca;
        cabeca.anterior = cabeca;
    }

    public void inserir(int dado) {
        No novo = new No(dado);
        novo.proximo = cabeca.proximo;
        novo.anterior = cabeca;
        cabeca.proximo.anterior = novo;
        cabeca.proximo = novo;
    }

    public No buscar(int valor) {
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            if (atual.dado == valor) return atual;
            atual = atual.proximo;
        }
        return null;
    }

    public boolean remover(int valor) {
        No alvo = buscar(valor);
        if (alvo != null) {
            alvo.anterior.proximo = alvo.proximo;
            alvo.proximo.anterior = alvo.anterior;
            return true;
        }
        return false;
    }

    public void imprimir() {
        No atual = cabeca.proximo;
        System.out.print("Lista: ");
        while (atual != cabeca) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
