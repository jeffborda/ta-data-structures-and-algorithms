package arrayshift;

public class ArrayShift {

    public static int[] insertShiftArray(int[] inputArr, int value) {

        if(inputArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] outputArr = new int[inputArr.length + 1];
        int center = (int) Math.ceil((double) inputArr.length / 2);
        for(int i = 0; i < outputArr.length; i++) {
            // Copy first half from input
            if(i < center) {
                outputArr[i] = inputArr[i];
            }
            // Copy the value into center element
            else if (i == center) {
                outputArr[i] = value;
            }
            // Copy second half of the array
            else {
                outputArr[i] = inputArr[i - 1];
            }
        }
        return outputArr;
    }
}
