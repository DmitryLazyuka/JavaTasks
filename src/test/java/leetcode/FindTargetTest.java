package leetcode;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FindTargetTest {

    @Test
    public void test() {
        assertEquals(new ArrayList<>(List.of(1,2)),  FindTarget.targetIndices(new int[]{1,2,5,2,3}, 2));
    }
    @Test
    public void test2() {
        assertEquals(new ArrayList<>(List.of(3)),  FindTarget.targetIndices(new int[]{1,2,5,2,3}, 3));
    }
    @Test
    public void test3() {
        assertEquals(new ArrayList<>(List.of(4)),  FindTarget.targetIndices(new int[]{1,2,5,2,3}, 5));
    }
    @Test
    public void test4() {
        assertEquals(new ArrayList<>(List.of(24,25)),  FindTarget.targetIndices(new int[]{53,8,12,80,99,6,39,15,64,31,17,12,98,79,6,69,99,67,93,30,76,9,3,77,45,77}, 99));
    }
}