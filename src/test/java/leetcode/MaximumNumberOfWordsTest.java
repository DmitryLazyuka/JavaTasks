package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumNumberOfWordsTest {

    @Test
    public void test() {
        String[] array = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assertEquals(6, MaximumNumberOfWords.mostWordsFound(array));
    }

    @Test
    public void test2() {
        String[] array = {"please wait", "continue to fight", "continue to win"};
        assertEquals(3, MaximumNumberOfWords.mostWordsFound(array));
    }
}