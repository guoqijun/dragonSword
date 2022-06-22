package medium;

public class RotateRightSolution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }

        ListNode next = head;
        while (true) {
            next = next.next;
            if (next == null) {
                next = head;
            }
            if (k == 0) {
                break;
            }
            k--;
        }

        ListNode newHead = next;

        while (newHead.next != null) {
            newHead = newHead.next;
        }

        newHead.next = head;

        return next;
    }
}
