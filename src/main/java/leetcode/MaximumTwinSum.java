package leetcode;

import leetcode.util.ListNode;
import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSum {
    public static int pairSum(ListNode head) {

        List<Integer> list = new ArrayList<>();
        int max = 0;

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int lastIndex = list.size() - 1;

        for (int i = 0; i < list.size() / 2; i++) {
            max = Math.max((list.get(i) + list.get(lastIndex - i)), max);
        }
        return max;
    }
}