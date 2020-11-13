package com.quinn.code.easy;

import com.quinn.code.enity.ListNode;

//2. 两数相加
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int l1val = 0;
        int l2val = 0;
        int good = 0;
        int add = 0;
        while (l1 != null && l2 != null) {
            l1val = l1.getVal();
            l2val = l2.getVal();
            good = l1val + l2val;
            add = good / 10;
            good = good % 10;
            if (l1.getNext() != null) {
                l1 = l1.getNext();
            }
            if (l2.getNext() != null) {
                l2 = l2.getNext();
            }
        }

        return null;
    }
}
