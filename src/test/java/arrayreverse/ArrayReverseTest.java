package arrayreverse;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReverseTest {

    @Test
    public void reverseArrayLengthZeroTest() {
        int[] expected = new int[0];
        assertArrayEquals(expected, ArrayReverse.reverseArray(expected));
    }

    @Test
    public void reverseArrayLengthOneTest() {
        int[] expected = {1};
        assertArrayEquals(expected, ArrayReverse.reverseArray(expected));
    }

    @Test
    public void reverseArrayMediumLengthTest() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, ArrayReverse.reverseArray(input));
    }
}