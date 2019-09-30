package stack;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class NodeTest {

    private Node<Integer> defaultNode = new Node<>();
    private Node<Integer> oneParameterNode = new Node<>(5);
    private Node<Integer> twoParameterNode = new Node<>(10, defaultNode);

    @Test
    public void defaultNodeConstructorTest_value() {
        assertNull("Value should be 'null' upon instantiation when using default constructor.", defaultNode.value);
    }

    @Test
    public void defaultNodeConstructorTest_next() {
        assertNull("Next should be 'null' upon instantiation when using default constructor.", defaultNode.next);
    }

    @Test
    public void oneParameterNodeConstructorTest_value() {
        Integer expected = 5;
        assertEquals("Value should be '0' upon instantiation when passing in value.", expected, oneParameterNode.value);
    }

    @Test
    public void oneParameterNodeConstructorTest_next() {
        assertNull("Next should be 'null' upon instantiation when using default constructor.", oneParameterNode.next);
    }

    @Test
    public void oneParameterNodeConstructorTest_genericType() {
        Node<Boolean> boolNode2 = new Node<>(true, new Node<>());
        assertThat("Confirm generic types are working.", boolNode2.value, instanceOf(Boolean.class));
    }

    @Test
    public void twoParameterNodeConstructorTest_value() {
        Integer expected = 10;
        assertEquals("Value should be '10'.", expected, twoParameterNode.value);
    }

    @Test
    public void twoParameterNodeConstructorTest_next() {
        assertEquals("Next should be pointing to the 'defaultNode'.", defaultNode, twoParameterNode.next);
    }

    @Test
    public void twoParameterNodeConstructorTest_genericType() {
        Node<Boolean> boolNode3 = new Node<>(true, new Node<>());
        assertThat("Confirm generic types are working.", boolNode3.value, instanceOf(Boolean.class));
    }

}