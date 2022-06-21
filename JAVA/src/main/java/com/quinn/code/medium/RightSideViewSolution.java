package com.quinn.code.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewSolution {
    public static void main(String[] args) {
        RightSideViewSolution code = new RightSideViewSolution();
        int[] A = new int[]{2, 5, 6, 0, 0, 1, 2};


        List<Integer> result = code.rightSideView(null);
        System.out.println(result);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        if (root == null) {
            return ret;
        }
        Queue<TreeNode> column = new LinkedList<>();
        column.offer(root);

        while (!column.isEmpty()) {
            int nodeSize = column.size();
            Integer right = null;
            for (int index = 0; index < nodeSize; index++) {
                TreeNode temp = column.poll();
                right = temp.val;
                if (temp.left != null) column.offer(temp.left);
                if (temp.right != null) column.offer(temp.right);
            }
            if (right != null) ret.add(right);
        }

        return ret;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
