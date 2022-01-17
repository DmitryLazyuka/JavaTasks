package kyu_6;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidBracesTest {

    private ValidBraces checker = new ValidBraces();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
        assertEquals(true, checker.isValid("([{}])"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
        assertEquals(false, checker.isValid("[("));
        assertEquals(false, checker.isValid("[({})](]"));
    }
}