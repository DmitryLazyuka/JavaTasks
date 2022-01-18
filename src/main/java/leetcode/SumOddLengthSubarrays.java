package leetcode;

public class SumOddLengthSubarrays {
    public static int sum(int[] arr) {

        int result = 0;

        for (int subLength = 1; subLength <= arr.length; subLength += 2) {
            for (int index = 0; index + subLength <= arr.length; index++) {
                for (int i = index, s = subLength; s > 0; i++, s--) {
                    result += arr[i];
                }
            }
        }
        return result;
    }
}