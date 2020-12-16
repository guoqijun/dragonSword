package com.quinn.code.medium;

import com.quinn.code.enity.ListNode;

public class RemoveNthFromEndSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        int fiveCount = 0;
        ListNode temp = head;
        ListNode five = dummy;
        if (head.next == null && n == 1) {
            return null;
        }

        while (temp.next != null) {
            temp = temp.next;
            if (fiveCount != n) {
                fiveCount++;
            } else {
                five = five.next;
            }
        }
        if (fiveCount == n) {
            if (five == head) {
                head.next = null;
                return head;
            }
            five.next = five.next.next;
        }

        return head;
    }
}
