package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        int firstDigit;


        for (int numberOfDigits = 1; numberOfDigits < 9; numberOfDigits++) {
            for (firstDigit = 1; firstDigit <= 9 - numberOfDigits; firstDigit++) {
                for (int i = numberOfDigits, temp = firstDigit; i >= 0; i--, temp++) {
                    result += temp * Math.pow(10, i);
                }
                if (result >= low && result <= high) {
                    list.add(result);
                }
                result = 0;
            }
        }
        return list;
    }
}