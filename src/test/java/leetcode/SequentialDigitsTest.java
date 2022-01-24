package leetcode;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SequentialDigitsTest {

    @Test
    public void test() {
        List<Integer> result = new ArrayList<>(Arrays.asList(123, 234));
        assertEquals(result, SequentialDigits.sequentialDigits(100, 300));
    }

    @Test
    public void test2() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1234,2345,3456,4567,5678,6789,12345));
        assertEquals(result, SequentialDigits.sequentialDigits(1000, 13000));
    }

    @Test
    public void test3() {
        List<Integer> result = new ArrayList<>(Arrays.asList(234,345,456,567,678,789,1234));
        assertEquals(result, SequentialDigits.sequentialDigits(234, 2314));
    }
}