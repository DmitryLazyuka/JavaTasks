package leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountMatchesTest {

    @Test
    public void test() {
        assertEquals(6, CountMatches.numberOfMatches(7));
    }

    @Test
    public void test2() {
        assertEquals(13, CountMatches.numberOfMatches(14));
    }
}