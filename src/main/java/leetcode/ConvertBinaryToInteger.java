package leetcode;

import leetcode.util.ListNode;

public class ConvertBinaryToInteger {
    public static int getDecimalValue(ListNode head) {

        StringBuilder builder = new StringBuilder();

        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(builder.toString(), 2);
    }
}