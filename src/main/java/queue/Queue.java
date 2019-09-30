package queue;


public class Queue<T extends Comparable<T>> {
    protected Node<T> front;

    public Queue() {
        this.front = null;
    }

    // Adds node to the back of the queue.
    public void enqueue(T value) {
        if(this.front == null) {
            this.front = new Node(value);
            return;
        }
        Node<T> current = this.front;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    // Dequeue takes out first Node from the front of queue.
    public T dequeue() {
        if(this.front == null) {
            return null;
        }
        Node<T> current = this.front;
        this.front = this.front.next;
        return current.value;
    }

    // Returns first value in queue, and keeps the node in place.
    public T peek() {
        if(this.front == null) {
            return null;
        }
        return this.front.value;
    }

}
