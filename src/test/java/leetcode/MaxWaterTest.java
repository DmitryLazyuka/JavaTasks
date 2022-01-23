package leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxWaterTest {

    @Test
    public void test() {
        assertEquals(49, MaxWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    @Test
    public void test2() {
        assertEquals(1, MaxWater.maxArea(new int[]{1, 1}));
    }
}
