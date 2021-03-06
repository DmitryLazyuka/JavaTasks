package kyu_7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LargestFiveDigitNumberTest {
    @Test
    public void exampleTests() {
        assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        assertEquals(67890, LargestFiveDigitNumber.solve("1234567890"));
        assertEquals(74765, LargestFiveDigitNumber.solve("731674765"));
        assertEquals(98765, LargestFiveDigitNumber.solve("10293847565748392019283746598765123123111"));
    }
}