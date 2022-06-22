package easy;


import enity.ListNode;

public class MergeTwoListsSolution {
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
