package arrayreverse;

public class ArrayReverse {

    public static int[] reverseArray(int[] arr) {
        if(arr.length == 0) {
            return arr;
        }
        int[] reversed = new int[arr.length];
        int reversedCounter = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            reversed[reversedCounter] = arr[i];
            reversedCounter++;
        }
        return reversed;
    }
}
