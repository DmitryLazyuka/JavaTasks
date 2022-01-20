package leetcode;

import leetcode.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumTwinSumTest {
    @Test
    public void test() {
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        assertEquals(6, MaximumTwinSum.pairSum(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        assertEquals(7, MaximumTwinSum.pairSum(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1, new ListNode(100000));
        assertEquals(100001, MaximumTwinSum.pairSum(head));
    }
}