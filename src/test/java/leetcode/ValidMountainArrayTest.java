package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidMountainArrayTest {
    @Test
    public void test() {
        assertEquals(false,  ValidMountainArray.validMountainArray(new int[]{2,1}));
    }

    @Test
    public void test2() {
        assertEquals(false,  ValidMountainArray.validMountainArray(new int[]{3,5,5}));
    }

    @Test
    public void test3() {
        assertEquals(true,  ValidMountainArray.validMountainArray(new int[]{0,3,2,1}));
    }
}