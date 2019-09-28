package stack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    private Stack<Integer> testStack1;

    @Before
    public void init() {
        testStack1 = new Stack<>();
    }

    @Test
    public void stackConstructorTest() {
        assertNull("Top should be 'null' upon instantiation.", testStack1.top);
    }

    @Test
    public void pushTest_afterOnePush() {
        Stack<Integer> testStack2 = new Stack<>();
        testStack2.push(10);
        Integer expected = 10;
        assertEquals("Pushing should add value '10' to the top of stack.", expected, testStack2.top.value);
    }

    @Test
    public void pushTest_afterTwoPushes() {
        Stack<Integer> testStack3 = new Stack<>();
        testStack3.push(10);
        testStack3.push(20);
        Integer expected = 20;
        assertEquals("Another push should add the new value '20' to the top of stack.", expected, testStack3.top.value);
    }

    @Test
    public void pushTest_afterThreePushes() {
        Stack<Integer> testStack4 = new Stack<>();
        testStack4.push(10);
        testStack4.push(20);
        testStack4.push(30);
        Integer expected = 30;
        assertEquals("Should push '30' to the top of stack.", expected, testStack4.top.value);
    }

    @Test
    public void popTest_afterOnePop() {
        Stack<Integer> testStack5 = new Stack<>();
        testStack5.push(10);
        testStack5.push(20);
        testStack5.push(30);
        Integer expected = 30;
        assertEquals("Value on top should be '30'.", expected, testStack5.pop());
    }

    @Test
    public void popTest_afterTwoPops() {
        Stack<Integer> testStack6 = new Stack<>();
        testStack6.push(10);
        testStack6.push(20);
        testStack6.push(30);
        testStack6.pop();
        Integer expected = 20;
        assertEquals("Value on top should be '20'.", expected, testStack6.pop());
    }

    @Test
    public void popTest_afterThreePops() {
        Stack<Integer> testStack7 = new Stack<>();
        testStack7.push(10);
        testStack7.push(20);
        testStack7.push(30);
        testStack7.pop();
        testStack7.pop();
        Integer expected = 10;
        assertEquals("Last node on stack should be '10'.", expected, testStack7.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void popTest_onEmptyStack() {
        Stack<Integer> testStack8 = new Stack<>();
        testStack8.push(10);
        testStack8.push(20);
        testStack8.push(30);
        testStack8.pop();
        testStack8.pop();
        testStack8.pop();
        testStack8.pop();
    }

    @Test
    public void peekTest_onEmptyStack() {
        Stack<Integer> testStack9 = new Stack<>();
        assertNull("If peek() is called on an empty stack it should return 'null'.", testStack9.peek());
    }

    @Test
    public void peekTest_onSizeOneStack() {
        Stack<Integer> testStack10 = new Stack<>();
        testStack10.push(100);
        Integer expected = 100;
        assertEquals("peek() should return the value '100' and keep it on the stack.", expected, testStack10.peek());
    }

//    @Test
//    public void peekTest_nodeRemainsOnTopAfterPeek() {
//        Integer expected = 100;
//        assertEquals("Confirm the stack is in the same state after the previous call to peek().", expected, testStack1.peek());
//    }

    @Test
    public void sizeTest_onEmptyStack() {
        Stack<Integer> testStack11 = new Stack<>();
        int expected = 0;
        assertEquals("If size() is called on empty stack, it should return '0'.", expected, testStack11.size());
    }

    @Test
    public void sizeTest_onSize1Stack() {
        Stack<Integer> testStack12 = new Stack<>();
        testStack12.push(111);
        int expected = 1;
        assertEquals("Should return the number of nodes on the stack.", expected, testStack12.size());
    }

    @Test
    public void sizeTest_onSize2Stack() {
        Stack<Integer> testStack13 = new Stack<>();
        testStack13.push(111);
        testStack13.push(222);
        int expected = 2;
        assertEquals("Should return the number of nodes on the stack.", expected, testStack13.size());
    }

    @Test
    public void sizeTest_onSize3Stack() {
        Stack<Integer> testStack14 = new Stack<>();
        testStack14.push(111);
        testStack14.push(222);
        testStack14.push(333);
        int expected = 3;
        assertEquals("Should return the number of nodes on the stack.", expected, testStack14.size());
    }

    @Test
    public void sizeTest_onSize100Stack() {
        Stack<Integer> testStack15 = new Stack<>();
        for(Integer i = 0; i < 100; i++) {
            testStack15.push(i);
        }
        int expected = 100;
        assertEquals("Should return the number of nodes on the stack.", expected, testStack15.size());
    }

    @Test
    public void testClear_onFilledStack() {
        Stack<Integer> testStack16 = new Stack<>();
        testStack16.push(10);
        testStack16.push(20);
        testStack16.push(30);
        testStack16.clear();
        assertNull("Top should now point to 'null'.", testStack16.top);
    }

    @Test
    public void testClear_usingSizeMethod() {
        Stack<Integer> testStack17 = new Stack<>();
        testStack17.push(10);
        testStack17.push(20);
        testStack17.push(30);
        testStack17.clear();
        int expected = 0;
        assertEquals("Should return '0'.", expected, testStack17.size());
    }

    @Test
    public void testClear_onEmptyList() {
        Stack<Integer> testStack18 = new Stack<>();
        testStack18.clear();
        assertNull("Calling clear() method on an empty list should NOT throw an exception.", testStack18.top);
    }

}