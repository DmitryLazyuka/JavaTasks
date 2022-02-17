package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidateCreditCardTest{
    @Test
    public void test891(){
        assertEquals(false, ValidateCreditCard.validate("891"));
        assertEquals(true, ValidateCreditCard.validate("2626262626262626"));
        assertEquals(true, ValidateCreditCard.validate("91"));
        assertEquals(true, ValidateCreditCard.validate("912030"));
        assertEquals(false, ValidateCreditCard.validate("8675309"));

    }
}