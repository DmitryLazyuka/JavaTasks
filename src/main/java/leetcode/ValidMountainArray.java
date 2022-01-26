package leetcode;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            maxIndex = arr[i] > maxValue ? i : maxIndex;
            maxValue = arr[i];
        }
        if (maxIndex == 0 || maxIndex == arr.length - 1) {
            return false;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (!((i < maxIndex & arr[i] < arr[i + 1]) || (i >= maxIndex & arr[i] > arr[i + 1]))) {
                return false;
            }
        }
        return true;
    }
}