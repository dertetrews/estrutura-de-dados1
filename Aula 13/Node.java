public class Node<T> {
    T data;
    ListaDuplamenteEncadeada.Node<T> next;
    ListaDuplamenteEncadeada.Node<T> prev;

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