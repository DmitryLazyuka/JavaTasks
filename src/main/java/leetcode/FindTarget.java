package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindTarget {
    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();
        int firstIndex = 0;
        int quantity = 0;

        for (int number : nums) {

            if (number < target) {
                firstIndex++;
            } else if (number == target) {
                quantity++;
            }
        }
        if (quantity == 1) {
            result.add(firstIndex);
        } else {
            for (int i = 0; i < quantity; i++) {
                result.add(firstIndex + i);
            }
        }
        return result;
    }
}