package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidPhoneTest {
    @Test
    public void tests() {
        assertEquals(true, ValidPhone.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, ValidPhone.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhone.validPhoneNumber("(098) 123 4567"));
    }
}