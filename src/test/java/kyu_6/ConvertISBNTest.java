package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertISBNTest {
    @Test
    public void ISBN_tests() {
        assertEquals("978-1-85326-158-9", ConvertISBN.convert("1-85326-158-0"));
        assertEquals("978-0-94001-673-6", ConvertISBN.convert("0-940016-73-7"));
        assertEquals("978-0-54501-022-1", ConvertISBN.convert("0-545-01022-5"));
        assertEquals("978-0-19853-453-2", ConvertISBN.convert("0-198-53453-1"));
    }
}