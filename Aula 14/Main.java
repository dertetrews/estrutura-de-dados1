public class Main {
    public static void main(String[] args) {
        System.out.println(" ListaComCabeca ");
        ListaComCabeca listaCabeca = new ListaComCabeca();
        listaCabeca.inserir(10);
        listaCabeca.inserir(20);
        listaCabeca.inserir(30);
        listaCabeca.imprimir();
        System.out.println("Buscar 20: " + (listaCabeca.buscar(20) != null));
        System.out.println("Remover 10: " + listaCabeca.remover(10));
        listaCabeca.imprimir();

        System.out.println("\n ListaCircularSimples ");
        ListaCircularSimples lcs = new ListaCircularSimples();
        lcs.inserirEsquerda(5);
        lcs.inserirEsquerda(3);
        lcs.inserirEsquerda(1);
        System.out.println("Contagem: " + lcs.contar());

        ListaCircularSimples copia = lcs.copiar();
        System.out.print("Cópia: ");
        No atual = copia.cabeca;
        if (atual != null) {
            do {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            } while (atual != copia.cabeca);
        }

        ListaCircularSimples outra = new ListaCircularSimples();
        outra.inserirEsquerda(6);
        outra.inserirEsquerda(4);
        lcs.concatenar(outra);

        System.out.println("\n\n ListaCircularDuplamenteEncadeada ");
        ListaCircularDuplamenteEncadeada lcd1 = new ListaCircularDuplamenteEncadeada();
        lcd1.inserirEsquerda(10);
        lcd1.inserirEsquerda(6);
        lcd1.inserirEsquerda(2);

        ListaCircularDuplamenteEncadeada lcd2 = new ListaCircularDuplamenteEncadeada();
        lcd2.inserirEsquerda(9);
        lcd2.inserirEsquerda(5);
        lcd2.inserirEsquerda(1);

        ListaCircularDuplamenteEncadeada intercalada = ListaCircularDuplamenteEncadeada.intercalarOrdenadas(lcd1, lcd2);
        No atual2 = intercalada.cabeca;
        if (atual2 != null) {
            do {
                System.out.print(atual2.dado + " ");
                atual2 = atual2.proximo;
            } while (atual2 != intercalada.cabeca);
        }

        System.out.println("\n\n ListaCircularComCabeca ");
        ListaCircularComCabeca lccc = new ListaCircularComCabeca();
        lccc.inserir(99);
        lccc.inserir(42);
        lccc.inserir(7);
        lccc.imprimir();
    }
}
