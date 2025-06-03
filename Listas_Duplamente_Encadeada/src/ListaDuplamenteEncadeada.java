public class ListaDuplamenteEncadeada<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        System.out.println(data + " adicionado no início.");
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(data + " adicionado no final.");
    }

    public void displayForward() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.print("Lista (Head -> Tail): ");
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println(" (Tamanho: " + size + ")");
    }

    public void displayBackward() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.print("Lista (Tail -> Head): ");
        Node<T> current = tail;
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev;
        }
        System.out.println(" (Tamanho: " + size + ")");
    }

    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("Erro: Lista vazia, não é possível remover.");
            return null;
        }
        Node<T> removedNode = head;
        T dataRemovida = removedNode.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        removedNode.next = null;
        size--;
        System.out.println(dataRemovida + " removido do início.");
        return dataRemovida;
    }

    public T removeLast() {
        if (isEmpty()) {
            System.out.println("Erro: Lista vazia, não é possível remover.");
            return null;
        }
        Node<T> removedNode = tail;
        T dataRemovida = removedNode.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        removedNode.prev = null;
        size--;
        System.out.println(dataRemovida + " removido do final.");
        return dataRemovida;
    }

}