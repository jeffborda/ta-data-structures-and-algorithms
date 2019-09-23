package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void nodeConstructorValueTest() {
        Node testNode = new Node(100);
        int expected = 100;
        assertEquals("Should be instantiated with the given value.", expected, testNode.value);
    }

    @Test
    public void nodeConstructorNextTest() {
        Node testNode = new Node(100);
        assertNull("Next should point to 'null'.", testNode.next);
    }

    @Test
    public void nodeTwoArgumentConstructorTest() {
        Node pointingToNode = new Node(100);
        Node testNode = new Node(500, pointingToNode);
        assertEquals("Node's next should point to 'pointingToNode'.", pointingToNode, testNode.next);
    }

}