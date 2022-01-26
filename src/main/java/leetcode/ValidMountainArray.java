package leetcode;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int currentIndex = 0;
        int lastIndex = arr.length - 1;

        if (arr.length < 3) {
            return false;
        }
        if (arr[currentIndex] >= arr[currentIndex + 1] | arr[lastIndex - 1] <= arr[lastIndex]) {
            return false;
        }

        while (arr[currentIndex] < arr[currentIndex + 1]) {
            currentIndex++;
        }

        for (int j = currentIndex; j < arr.length - 1; j++) {
            if (arr[j] <= arr[j + 1]) {
                return false;
            }
        }
        return true;
    }
}