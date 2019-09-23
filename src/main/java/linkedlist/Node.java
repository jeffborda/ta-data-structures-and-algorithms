package linkedlist;

public class Node {
    protected int value;
    protected Node next;

    protected Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    protected Node(int value) {
        this.value = value;
    }


}
