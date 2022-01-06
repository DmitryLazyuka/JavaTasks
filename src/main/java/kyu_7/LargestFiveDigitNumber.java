package kyu_7;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {

        int max = 0;

        for (int i = 0; i < digits.length() - 4; i++) {
            int number = Integer.parseInt(digits.substring(i, i + 5));
            max = Math.max(number, max);
        }
        return max;
    }
}