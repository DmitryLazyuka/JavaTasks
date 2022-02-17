package kyu_7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FoldingTest {
    @Test
    public void sampleTests() {
        assertEquals((Long)42L, Folding.fold(384000000.0));
        assertEquals((Long)0L, Folding.fold(0.00005));
    }
}