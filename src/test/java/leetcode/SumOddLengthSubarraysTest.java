package leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOddLengthSubarraysTest {

    @Test
    public void test() {
        assertEquals(58,  SumOddLengthSubarrays.sum(new int[]{1, 4, 2, 5, 3}));
        assertEquals(3,  SumOddLengthSubarrays.sum(new int[]{1, 2}));
        assertEquals(206,  SumOddLengthSubarrays.sum(new int[]{1, 8, 4, 5, 3, 7, 4}));
        assertEquals(30,  SumOddLengthSubarrays.sum(new int[]{9,4,2}));
        assertEquals(6,  SumOddLengthSubarrays.sum(new int[]{6}));
    }
}