package linkedlist;

import java.util.StringJoiner;

public class LinkedList {

    protected Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        this.head = new Node(value, this.head);
    }

    public boolean includes(int value) {
        Node current = this.head;
        while(current != null) {
            if(current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    protected Node getHead() {
        return this.head;
    }

    protected int getHeadValue() {
        return this.head.value;
    }

    @Override
    public String toString() {
        Node current = this.head;
        StringJoiner result = new StringJoiner(", ");
        while(current != null) {
            Integer currentValue = current.value;
            result.add(currentValue.toString());
            current = current.next;
        }
        return result.toString();
    }
}
