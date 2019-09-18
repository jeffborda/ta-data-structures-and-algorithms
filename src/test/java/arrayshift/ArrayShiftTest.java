package arrayshift;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void insertShiftArrayTestMediumLengthEven() {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int inputValue = 999;
        int[] expected = {1, 2, 3, 4, 5, 999, 6, 7, 8, 9, 10};
        assertArrayEquals("Should insert into the middle of an even length array.", expected, ArrayShift.insertShiftArray(inputArr, inputValue));
    }

    @Test
    public void insertShiftArrayTestMediumLengthOdd() {
        int[] inputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int inputValue = 999;
        int[] expected = {1, 2, 3, 4, 5, 999, 6, 7, 8, 9};
        assertArrayEquals("Should insert to the right side of an odd length array.", expected, ArrayShift.insertShiftArray(inputArr, inputValue));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertShiftArrayTestLengthZero() {
        int[] inputArray = new int[0];
        ArrayShift.insertShiftArray(inputArray, 99);
    }

    @Test
    public void insertShiftArrayTestLengthOne() {
        int[] inputArr = {1};
        int inputValue = 999;
        int[] expected = {1, 999};
        assertArrayEquals("Should insert to the end of a length one array.", expected, ArrayShift.insertShiftArray(inputArr, inputValue));
    }

    @Test
    public void insertShiftArrayTestLengthTwo() {
        int[] inputArr = {1, 2};
        int inputValue = 999;
        int[] expected = {1, 999, 2};
        assertArrayEquals("Should insert to the middle of a length two array.", expected, ArrayShift.insertShiftArray(inputArr, inputValue));
    }
}