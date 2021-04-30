package com.quinn.code.medium;

import java.util.Arrays;
import java.util.List;

public class NumComponentsSolution {
    public int numComponents(ListNode head, int[] G) {
        int result = 0;
        boolean counting = false;
        if (head == null) {
            return result;
        }
        if (inG(G, head.val)) {
            counting = true;
        }
        while (head != null) {
            if (inG(G, head.val)) {
                counting = true;
            } else {
                if (counting) {
                    counting = false;
                    result++;
                }
            }
            head = head.next;
        }
        if (counting) {
            result++;
        }

        return result;
    }

    public boolean inG(int[] G, int target) {
        for (int index = 0; index < G.length; index++) {
            if (G[index] == target) {
                return true;
            }
        }
        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
