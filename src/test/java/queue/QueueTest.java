package queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void queueConstructorTest() {
        Queue<Integer> testQueue = new Queue<>();
        assertNull("Front should point to 'null' upon instantiation.", testQueue.front);
    }

    @Test
    public void enqueueTest_oneItem() {
        Queue<Integer> testQueue = new Queue<>();
        testQueue.enqueue(1);
        Integer expected = 1;
        assertEquals("Front should now point to the only node in the queue.", expected, testQueue.front.value);
    }

    @Test
    public void enqueueTest_twoItems() {
        Queue<Integer> testQueue = new Queue<>();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        Integer expected = 1;
        assertEquals("Front should point to the first node enqueued.", expected,testQueue.front.value);
    }

    @Test
    public void enqueueTest_twoItemsCheckEndOfQueue() {
        Queue<Integer> testQueue = new Queue<>();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        Integer expected = 2;
        assertEquals("The end of the queue should contain the value '2'.", expected,testQueue.front.next.value);
    }

    @Test
    public void enqueueTest_manyItems() {
        Queue<Integer> testQueue = new Queue<>();
        for(Integer i = 0; i < 100; i++) {
            testQueue.enqueue(i);
        }
        Node<Integer> current = testQueue.front;
        for(Integer i = 0; i < 100; i++) {
            assertEquals("Should insert all values into the queue.", i, current.value);
            current = current.next;
        }
    }

    @Test
    public void dequeuTest_oneItem() {
        Queue<Integer> testQueue = new Queue<>();
        testQueue.enqueue(1);
        Integer expected = 1;
        assertEquals("Should return the only value in the queue.", expected, testQueue.dequeue());
    }

    @Test
    public void dequeueTest_manyItems() {
        Queue<Integer> testQueue = new Queue<>();
        for(Integer i = 0; i < 100; i++) {
            testQueue.enqueue(i);
        }
        Node<Integer> current = testQueue.front;
        for(Integer i = 0; i < 100; i++) {
            assertEquals("Should dequeue and return all values.", i, current.value);
            current = current.next;
        }
    }

    @Test
    public void dequeueTest_allItemsCheckNull() {
        Queue<Integer> testQueue = new Queue<>();
        for(Integer i = 0; i < 100; i++) {
            testQueue.enqueue(i);
        }
        for(Integer i = 0; i < 100; i++) {
            testQueue.dequeue();
        }
        assertNull("Front should point to 'null' after all items have been dequeued.", testQueue.front);
    }

    @Test
    public void peekTest_oneCall() {
        Queue<Integer> testQueue = new Queue<>();
        testQueue.enqueue(10);
        Integer expected = 10;
        assertEquals("Should return the value at the front of the queue, but not remove the node.", expected, testQueue.peek());
    }

    @Test
    public void peekTest_multipleCalls() {
        Queue<Integer> testQueue = new Queue<>();
        testQueue.enqueue(99);
        Integer expected = 99;
        testQueue.peek();
        testQueue.peek();
        assertEquals("Calls to peek() should not remove the node at the front of the queue.", expected, testQueue.peek());
    }

}