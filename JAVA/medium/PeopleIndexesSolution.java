package medium;

import java.util.*;

public class PeopleIndexesSolution {

    public boolean canPermutePalindrome(String s) {
        if (s == null) {
            return false;
        }
        Set<Character> set = new HashSet<>();

        for (int index = 0; index < s.length(); index++) {
            char item = s.charAt(index);

            if (set.contains(item)) {
                set.remove(item);
            } else {
                set.add(item);
            }
        }

        return set.size() <= 1;
    }


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

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode result = new ListNode();
        Stack<Integer> queue = new Stack<Integer>();

        while (head != null) {
            queue.add(head.val);
            head = head.next;
        }
        ListNode newHead;
        newHead = result;
        if (!queue.isEmpty()) {
            result.val = queue.pop();
        }
        while (!queue.isEmpty()) {
            ListNode temp = new ListNode();
            temp.val = queue.pop();
            result.next = temp;
            result = result.next;
        }

        return newHead;
    }

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < favoriteCompanies.size(); index++) {

            List<String> item = favoriteCompanies.get(index);
            boolean checkFlag = true;
            for (int check = 0; check < favoriteCompanies.size(); check++) {
                if (check == index) {
                    continue;
                }
                List<String> checkOne = favoriteCompanies.get(check);
                Set<String> set = new HashSet<>(checkOne);
                if (set.containsAll(item)) {
                    checkFlag = false;
                    break;
                }
            }

            if (checkFlag) result.add(index);
        }

        return result;
    }
}
