package kyu_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test2() {
        assertEquals("42 -9", HighestAndLowest.highAndLow2("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}