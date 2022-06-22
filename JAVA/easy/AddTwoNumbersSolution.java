package easy;

import enity.ListNode;

//2. 两数相加
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode cursor = result;
        int l1val = 0;
        int l2val = 0;
        int good = 0;
        int add = 0;
        while (l1 != null || l2 != null || add != 0) {
            if (l1 != null) {
                l1val = l1.val;
                l1 = l1.next;
            } else {
                l1val = 0;
            }
            if (l2 != null) {
                l2val = l2.val;
                l2 = l2.next;
            } else {
                l2val = 0;
            }
            good = l1val + l2val + add;
            add = good / 10;
            good = good % 10;

            if (cursor.val == -1) {
                cursor.val = (good);
            } else {
                ListNode newOne = new ListNode(good);
                cursor.next = (newOne);
                cursor = newOne;
            }
        }

        return result;
    }
}
