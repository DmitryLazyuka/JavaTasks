package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StopGninnipsMySdrowTest {

    @Test
    public void test() {
        assertEquals("emocleW", new StopGninnipsMySdrow().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopGninnipsMySdrow().spinWords("Hey fellow warriors"));
    }

    @Test
    public void test2() {
        assertEquals("emocleW", new StopGninnipsMySdrow().spinWords2("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopGninnipsMySdrow().spinWords2("Hey fellow warriors"));
    }
}