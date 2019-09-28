package stack;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class NodeTest {

    Node<Integer> defaultNode = new Node<>();
    Node<Integer> twoParameterNode = new Node<>(10, defaultNode);

    @Test
    public void defaultNodeConstructorTest_value() {
        assertNull("Value should be 'null' upon instantiation when using default constructor.", defaultNode.value);
    }

    @Test
    public void defaultNodeConstructorTest_next() {
        assertNull("Next should be 'null' upon instantiation when using default constructor.", defaultNode.next);
    }

    @Test
    public void twoArgumentNodeConstructorTest_value() {
        Integer expected = 10;
        assertEquals("Value should be '10'.", expected, twoParameterNode.value);
    }

    @Test
    public void twoArgumentNodeConstructorTest_next() {
        assertEquals("Next should be pointing to the 'defaultNode'.", defaultNode, twoParameterNode.next);
    }

    @Test
    public void twoParameterNodeConstructorTest_genericsAllowed() {
        Node<Boolean> boolNode2 = new Node<>(true, new Node<>());
        assertThat(boolNode2.value, instanceOf(Boolean.class));
    }

}