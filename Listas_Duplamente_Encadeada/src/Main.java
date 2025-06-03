public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        lista.addFirst("Homer");
        lista.addLast("Marge");
        System.out.println("tamanho da lista: " + lista.getSize());
        lista.displayForward();
        lista.removeFirst();
        lista.removeLast();
        lista.displayForward();
        lista.addFirst("Homer");
        lista.addLast("Bart");
        lista.addLast("Moll");
        lista.displayForward();
        lista.removeLast();
        lista.removeLast();
        lista.removeFirst(); // Quarto passo

        // Passo 5
        lista.addLast("Homer");
        lista.addLast("Bart");
        lista.addFirst("Lisa");
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 6 (esvaziar removendo elementos manualmente)
        lista.removeFirst();
        lista.removeFirst();
        lista.removeFirst();
        lista.displayForward();

        // Passo 7 (sem addAt, usaremos sequência lógica)
        lista.addLast("Homer");
        lista.addLast("Maggie");
        // Simular Bart na posição 0 e Marge na posição 1
        // Para isso, recriamos a lista na ordem desejada
        lista.removeFirst(); // remove Homer
        lista.removeFirst(); // remove Maggie
        lista.addFirst("Maggie");
        lista.addFirst("Marge");
        lista.addFirst("Bart");
        lista.addLast("Homer");
        lista.displayForward();
        // Não é possível verificar se "Lisa" está na lista sem .contains()

        // Passo 8 (esvaziar manualmente)
        while (!lista.isEmpty()) {
            lista.removeFirst();
        }

        // Passo 9
        lista.addLast("Homer");
        lista.addLast("Bart");
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 10 (imprimir a lista como forma de verificação)
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 11
        lista.removeFirst();
        lista.removeFirst();

        // Passo 12 (seguir a ordem com o que temos disponível)
        lista.addFirst("Bart");
        lista.addFirst("Homer");
        lista.addLast("Marge");
        lista.removeFirst(); // remove Homer
        lista.addFirst("Maggie"); // para Maggie ficar na posição 1
        lista.addFirst("Ned Flanders");
        lista.addLast("Sr. Burns");
        lista.displayForward();

        // Passo 13
        lista.removeLast();
        lista.displayForward();

        // Passo 14
        // Simular remoção da posição 1: remover primeiro, depois remover o novo primeiro (posição 1 original)
        lista.removeFirst(); // Ned
        lista.removeFirst(); // Maggie
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 15 (imprimir como forma de "verificação")
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 16
        lista.removeFirst();
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 17
        lista.displayForward();
        System.out.println("Tamanho da lista: " + lista.getSize());

        // Passo 18
        while (!lista.isEmpty()) {
            lista.removeFirst();
        }
        lista.displayForward();
    }
}
