package stack;

import java.util.EmptyStackException;

public class Stack<T extends Comparable<T>> {
    protected Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T value) {
        this.top = new Node<T>(value, this.top);
    }

    public T pop() throws EmptyStackException {
        if(this.top == null) {
            throw new EmptyStackException();
        }
        Node<T> n = this.top;
        this.top = this.top.next;
        return n.value;
    }

    public T peek() {
        if(this.top == null) {
            return null;
        }
        return this.top.value;
    }

    public int size() {
        if(this.top == null) {
            return 0;
        }
        return size(this.top);
    }

    private int size(Node<T> current) {
        if(current.next == null) {
            return 1;
        }
        return 1 + size(current.next);
    }

    public void clear() {
        this.top = null;
        return;
    }


}
