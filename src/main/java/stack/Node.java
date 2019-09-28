package stack;

public class Node<T extends Comparable<T>> {
    T value;
    Node<T> next;

    public Node() {
        this.value = null;
        this.next = null;
    }

    public Node(T value, Node<T> next) {
        this.next = next;
        this.value = value;
    }

}
