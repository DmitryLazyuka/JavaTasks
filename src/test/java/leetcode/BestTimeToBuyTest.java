package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyTest {

    @Test
    public void test() {
        assertEquals(7, BestTimeToBuy.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void test2() {
        assertEquals(4, BestTimeToBuy.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test3() {
        assertEquals(0, BestTimeToBuy.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
