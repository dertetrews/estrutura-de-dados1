public class ListaDuplamenteEncadeada<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    public void inserirOrdenado(T valor) {
        Node<T> novo = new Node<>(valor);
        if (head == null) {
            head = tail = novo;
        } else if (valor.compareTo(head.data) <= 0) {
            novo.next = head;
            head.prev = novo;
            head = novo;
        } else if (valor.compareTo(tail.data) >= 0) {
            tail.next = novo;
            novo.prev = tail;
            tail = novo;
        } else {
            Node<T> atual = head;
            while (atual != null && valor.compareTo(atual.data) > 0) {
                atual = atual.next;
            }
            novo.prev = atual.prev;
            novo.next = atual;
            atual.prev.next = novo;
            atual.prev = novo;
        }
        size++;
    }

    public void removerPrimos() {
        Node<T> atual = head;
        while (atual != null) {
            Node<T> proximo = atual.next;
            if (atual.data instanceof Integer && isPrimo((Integer) atual.data)) {
                remover(atual);
            }
            atual = proximo;
        }
    }

    private void remover(Node<T> no) {
        if (no == head && no == tail) {
            head = tail = null;
        } else if (no == head) {
            head = no.next;
            head.prev = null;
        } else if (no == tail) {
            tail = no.prev;
            tail.next = null;
        } else {
            no.prev.next = no.next;
            no.next.prev = no.prev;
        }
        size--;
    }

    private boolean isPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void displayForward() {
        Node<T> atual = head;
        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node<T> atual = tail;
        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.prev;
        }
        System.out.println();
    }
}
