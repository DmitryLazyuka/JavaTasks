package leetcode;

public class MaxWater {
    public static int maxArea(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length - 1 && height[i] != 0; i++) {
            for (int j = height.length - 1; j > i && height[j] != 0; j--) {
                maxArea = Math.max(maxArea,Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }
}