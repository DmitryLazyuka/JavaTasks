package kyu_6;

import static org.junit.Assert.*;

public class MakeDeadfishTest {
    @org.junit.Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, MakeDeadfish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, MakeDeadfish.parse("iiisdosodddddiso"));
    }
}