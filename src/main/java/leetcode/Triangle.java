package leetcode;

import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {

        for (int i = triangle.size() - 1; i > 0; i--) {
            int temp;

            for (int j = 0; j <= triangle.get(i).size() - 2; j++) {
                temp = triangle.get(i - 1).get(j);
                temp += Math.min(triangle.get(i).get(j), triangle.get(i).get(j + 1));
                triangle.get(i - 1).set(j, temp);
            }
        }
        return triangle.get(0).get(0);
    }
}