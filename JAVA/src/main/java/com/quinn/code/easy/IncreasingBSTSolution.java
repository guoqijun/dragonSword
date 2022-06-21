package com.quinn.code.easy;

import com.quinn.code.enity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBSTSolution {
    public List<TreeNode> values;

    public TreeNode increasingBST(TreeNode root) {
        values = new ArrayList<>();
        midForeach(root);

        if (values.size() == 0) {
            return null;
        }

        if (values.size() == 1) {
            return values.get(0);
        }

        values.get(0).left = null;
        values.get(0).right = values.get(1);
        for (int i = 1; i < values.size(); i++) {
            values.get(i).left = null;
            values.get(i - 1).right = values.get(i);
        }

        return values.get(0);
    }

    public void midForeach(TreeNode root) {
        if (root == null) {
            return;
        }

        midForeach(root.left);
        values.add(root);
        midForeach(root.right);
    }


    public static void main(String[] args) {
        IncreasingBSTSolution reverse = new IncreasingBSTSolution();
        TreeNode a = new TreeNode(3);
        TreeNode result = reverse.increasingBST(a);
        System.out.println(result);
    }
}
