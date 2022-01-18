package leetcode;

public class SumOddLengthSubarrays {
    public static int sum(int[] arr) {

        int result = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            result += (((i + 1) * (length - i) + 1) / 2) * arr[i];
        }
        return result;
    }
}