class Lista_Ligada {
    Lista cabeca;
    Lista calda;

    public Lista_Ligada() {
        this.cabeca = null;
        this.calda = null;
    }

    public void adicionarPrimeiro (String data){
        Lista novaLista = new Lista(data);
        if (cabeca == null){
            cabeca = calda = novaLista;
        }else{
            novaLista.proximo = cabeca;
            cabeca.proximo = novaLista;
            cabeca = novaLista;
        }
    }
    public void adicionar (String data){
        Lista novaLista = new Lista(data);
        if(calda == null){
            cabeca = calda = novaLista;
        }else{
            calda.proximo = novaLista;
            novaLista.atual = calda;
            calda = novaLista;
        }
    }
    public void remove(String data) {
        Lista current = cabeca;
        while (current != null) {
            if (current.data == data) {
                if (current.atual != null) {
                    current.atual.proximo = current.proximo;
                } else {
                    cabeca = current.proximo;
                }
                if (current.proximo != null) {
                    current.proximo.atual = current.atual;
                } else {
                    calda = current.atual;
                }
                return;
            }
            current = current.proximo;
        }
    }

    public void mostrarLista (){
        Lista local = cabeca;
        while (local != null){
            System.out.println(local.data+ "");
            local = local.proximo;
        }
        System.out.println();
    }

    public void mostrarUltimo(){
        Lista local = calda;
        while (local != null){
            System.out.println(local.data+ "");
            local = local.atual;
        }
        System.out.println();
    }

}