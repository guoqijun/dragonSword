package com.quinn.code.hard;

import com.quinn.code.enity.ListNode;

public class MergeKListsSolution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode fuck = lists[0];

        for (int i = 1; i < lists.length; i++) {
            fuck = mergeTwoLists(fuck, lists[i]);
        }

        return fuck;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode node = new ListNode(0);
        ListNode result = node;
        while (true) {
            if (l1 == null) {
                node.next = l2;
                return result.next;
            }
            if (l2 == null) {
                node.next = l1;
                return result.next;
            }

            if (l1.val > l2.val) {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            } else {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            }
        }
    }
}
