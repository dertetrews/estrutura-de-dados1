class ListaCircularSimples {
    No cabeca;

    public ListaCircularSimples() {
        cabeca = null;
    }

    public void inserirEsquerda(int dado) {
        No novo = new No(dado);
        if (cabeca == null) {
            novo.proximo = novo;
            cabeca = novo;
        } else {
            No temp = cabeca;
            while (temp.proximo != cabeca)
                temp = temp.proximo;
            novo.proximo = cabeca;
            temp.proximo = novo;
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

    public void concatenar(ListaCircularSimples outra) {
        if (outra.cabeca == null) return;
        if (cabeca == null) {
            cabeca = outra.cabeca;
            return;
        }
        No fim1 = cabeca;
        while (fim1.proximo != cabeca)
            fim1 = fim1.proximo;
        No fim2 = outra.cabeca;
        while (fim2.proximo != outra.cabeca)
            fim2 = fim2.proximo;
        fim1.proximo = outra.cabeca;
        fim2.proximo = cabeca;
    }

    public ListaCircularSimples copiar() {
        ListaCircularSimples copia = new ListaCircularSimples();
        if (cabeca == null) return copia;
        No atual = cabeca;
        do {
            copia.inserirEsquerda(atual.dado);
            atual = atual.proximo;
        } while (atual != cabeca);
        return copia;
    }

    public static ListaCircularSimples intercalarOrdenadas(ListaCircularSimples l1, ListaCircularSimples l2) {
        ListaCircularSimples resultado = new ListaCircularSimples();
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