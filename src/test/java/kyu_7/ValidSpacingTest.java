package kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidSpacingTest {

    @Test
    public void fixedTests() {
        assertEquals(ValidSpacing.validSpacing("Hello world"), true);
        assertEquals(ValidSpacing.validSpacing(" Hello world"), false);
        assertEquals(ValidSpacing.validSpacing("Hello  world "), false);
        assertEquals (ValidSpacing.validSpacing("Hello"), true);
        assertEquals (ValidSpacing.validSpacing("Helloworld"), true);
    }
}