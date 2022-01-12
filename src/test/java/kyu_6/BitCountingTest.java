package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BitCountingTest {
    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits2(1234));
        assertEquals(1, BitCounting.countBits2(4));
        assertEquals(3, BitCounting.countBits2(7));
        assertEquals(2, BitCounting.countBits2(9));
        assertEquals(2, BitCounting.countBits2(10));
    }
}