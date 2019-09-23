package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void constructorTestEmptyList() {
        LinkedList testList = new LinkedList();
        assertNull("Before inserting anything, head should point to 'null'.", testList.getHead());
    }

    @Test
    public void insertTestAfterOneInsert() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        int expected = 1;
        assertEquals("Value of head should equal the only value inserted.", expected, testList.getHeadValue());
    }

    @Test
    public void insertTestAfterTwoInserts() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        int expected = 2;
        assertEquals("Value of head should equal the last value inserted.", expected, testList.getHeadValue());
    }

    @Test
    public void includesTestOnEmptyList() {
        LinkedList testList = new LinkedList();
        assertFalse("Should return 'false' for any value when called on empty list.", testList.includes(1));
    }

    @Test
    public void includesTestOnSizeOneList() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        assertTrue("Should return 'true' if value contained in list.", testList.includes(1));
    }

    @Test
    public void includesTestOnSizeOneListNotContained() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        assertFalse("Should return 'true' if value contained in list.", testList.includes(999));
    }

    @Test
    public void includesTestManyNodesAtEnd() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        assertTrue("Should return 'true' if value contained in list.", testList.includes(5));
    }

    @Test
    public void includesTestManyNodesAtBeginning() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        assertTrue("Should return 'true' if value contained in list.", testList.includes(1));
    }

    @Test
    public void includesTestManyNodesInMiddle() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        assertTrue("Should return 'true' if value contained in list.", testList.includes(3));
    }

    @Test
    public void includesTestManyNodesNotContained() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        assertFalse("Should return 'true' if value contained in list.", testList.includes(999));
    }

    @Test
    public void toStringTest() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        String expected = "1, 2, 3, 4, 5";
        assertEquals("Should return formated string.", expected, testList.toString());
    }

    @Test
    public void toStringTestEmptyList() {
        LinkedList testList = new LinkedList();
        String expected = "";
        assertEquals("Should return an empty string.", expected, testList.toString());
    }
}