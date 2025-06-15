public class ListaDuplamenteEncadeada {
    No cabeca;
    No cauda;
    public ListaDuplamenteEncadeada(){
        this.cabeca = null;
        this.cauda = null;
    }

    public void adicionar(int dado){
        No novoNo = new No(dado);
        if(cabeca == null){
            cabeca = novoNo;
            cauda = novoNo;
        }else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    public void imprimir(){
        No atual = cabeca;
        System.out.println("Lista: ");
        while (atual != null){
            System.out.println(atual.dado+" ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void concatenar(ListaDuplamenteEncadeada outraLista){
        if(outraLista.cabeca == null){
            return;
        }
        if (this.cabeca == null){
            this.cabeca = outraLista.cabeca;
            this.cauda = outraLista.cauda;
        }else {
            this.cauda.proximo = outraLista.cabeca;
            outraLista.cabeca.anterior = this.cauda;
            this.cauda = outraLista.cauda;
        }
    }

    public ListaDuplamenteEncadeada[] separar(){
        if(cabeca == null || cabeca.proximo == null){
            return new ListaDuplamenteEncadeada[]{this, new ListaDuplamenteEncadeada()};
        }
        No meio = cabeca;
        No rapido = cabeca;
        while(rapido != null && rapido.proximo != null){
            rapido = rapido.proximo.proximo;
            meio = meio.proximo;
        }
        ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        lista1.cabeca = this.cabeca;
        lista1.cauda = meio.anterior;
        lista1.cauda.proximo = null;
        lista2.cabeca = meio;
        meio.anterior = null;
        lista2.cauda = this.cauda;
        this.cabeca = null;
        this.cauda = null;
        return new ListaDuplamenteEncadeada[]{lista1, lista2};
    }

    public static ListaDuplamenteEncadeada intercalarOrdenadas(ListaDuplamenteEncadeada lista1, ListaDuplamenteEncadeada lista2){
        ListaDuplamenteEncadeada listaIntercalada = new ListaDuplamenteEncadeada();
        No atual1 = lista1.cabeca;
        No atual2 = lista2.cabeca;
        while(atual1 != null && atual2 != null){
            if (atual1.dado <= atual2.dado){
                listaIntercalada.adicionar(atual1.dado);
                atual1 = atual1.proximo;
            }else {
                listaIntercalada.adicionar(atual2.dado);
                atual2 = atual2.proximo;
            }
        }
        while(atual1 != null){
                listaIntercalada.adicionar(atual1.dado);
                atual1 = atual1.proximo;
        }
        while (atual2 != null){
            listaIntercalada.adicionar(atual2.dado);
            atual2 = atual2.proximo;
        }
        return listaIntercalada;
    }
}
