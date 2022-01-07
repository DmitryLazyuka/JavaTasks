package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesTest {
    @Test
    public void test() {
        assertEquals(23, new Multiples().solution(10));
        assertEquals(143, new Multiples().solution(25));
        assertEquals(0, new Multiples().solution(-15));
    }
}