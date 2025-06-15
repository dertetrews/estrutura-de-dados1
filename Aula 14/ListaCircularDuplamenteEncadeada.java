class ListaCircularDuplamenteEncadeada {
    No cabeca;

    public ListaCircularDuplamenteEncadeada() {
        cabeca = null;
    }

    public void inserirEsquerda(int dado) {
        No novo = new No(dado);
        if (cabeca == null) {
            novo.proximo = novo;
            novo.anterior = novo;
            cabeca = novo;
        } else {
            No ultimo = cabeca.anterior;
            novo.proximo = cabeca;
            novo.anterior = ultimo;
            cabeca.anterior = novo;
            ultimo.proximo = novo;
            cabeca = novo;
        }
    }

    public int contar() {
        if (cabeca == null) return 0;
        int count = 1;
        No atual = cabeca.proximo;
        while (atual != cabeca) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public void concatenar(ListaCircularDuplamenteEncadeada outra) {
        if (outra.cabeca == null) return;
        if (cabeca == null) {
            cabeca = outra.cabeca;
            return;
        }
        No fim1 = cabeca.anterior;
        No fim2 = outra.cabeca.anterior;

        fim1.proximo = outra.cabeca;
        outra.cabeca.anterior = fim1;
        fim2.proximo = cabeca;
        cabeca.anterior = fim2;
    }

    public ListaCircularDuplamenteEncadeada copiar() {
        ListaCircularDuplamenteEncadeada copia = new ListaCircularDuplamenteEncadeada();
        if (cabeca == null) return copia;
        No atual = cabeca;
        do {
            copia.inserirEsquerda(atual.dado);
            atual = atual.proximo;
        } while (atual != cabeca);
        return copia;
    }

    public static ListaCircularDuplamenteEncadeada intercalarOrdenadas(ListaCircularDuplamenteEncadeada l1, ListaCircularDuplamenteEncadeada l2) {
        ListaCircularDuplamenteEncadeada resultado = new ListaCircularDuplamenteEncadeada();
        No a = l1.cabeca, b = l2.cabeca;
        if (a == null) return l2.copiar();
        if (b == null) return l1.copiar();

        do {
            if (a.dado <= b.dado) {
                resultado.inserirEsquerda(a.dado);
                a = a.proximo;
            } else {
                resultado.inserirEsquerda(b.dado);
                b = b.proximo;
            }
        } while (a != l1.cabeca && b != l2.cabeca);

        while (a != l1.cabeca) {
            resultado.inserirEsquerda(a.dado);
            a = a.proximo;
        }

        while (b != l2.cabeca) {
            resultado.inserirEsquerda(b.dado);
            b = b.proximo;
        }

        return resultado;
    }
}