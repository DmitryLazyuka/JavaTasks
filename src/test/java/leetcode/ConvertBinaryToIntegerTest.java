package leetcode;

import leetcode.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBinaryToIntegerTest {

    @Test
    public void test() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        assertEquals(5, ConvertBinaryToInteger.getDecimalValue(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(0))));
        assertEquals(10, ConvertBinaryToInteger.getDecimalValue(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(0);
        assertEquals(0, ConvertBinaryToInteger.getDecimalValue(head));
    }
}