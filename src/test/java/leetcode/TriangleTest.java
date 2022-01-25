package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void test() {
        List<Integer> ar1 = Arrays.asList(2);
        List<Integer> ar2 = Arrays.asList(3, 4);
        List<Integer> ar3 = Arrays.asList(6, 5, 7);
        List<Integer> ar4 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> list = Arrays.asList(ar1, ar2, ar3, ar4);
        assertEquals(11, Triangle.minimumTotal(list));
    }

    @Test
    public void test2() {
        List<Integer> ar1 = Arrays.asList(-10);
        List<List<Integer>> list = Arrays.asList(ar1);
        assertEquals(-10, Triangle.minimumTotal(list));
    }
}