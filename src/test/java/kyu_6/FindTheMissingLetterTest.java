package kyu_6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindTheMissingLetterTest {
    @Test
    public void exampleTests() {
        assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('I', FindTheMissingLetter.findMissingLetter(new char[] { 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M'}));
        assertEquals('u', FindTheMissingLetter.findMissingLetter(new char[] { 't', 'v' }));
        assertEquals('p', FindTheMissingLetter.findMissingLetter(new char[] { 'l', 'm', 'n', 'o', 'q', 'r', 's', 't' }));
        assertEquals('b', FindTheMissingLetter.findMissingLetter(new char[] { 'a', 'c' }));
        assertEquals('Q', FindTheMissingLetter.findMissingLetter(new char[] { 'O', 'P', 'R', 'S' }));
    }
}