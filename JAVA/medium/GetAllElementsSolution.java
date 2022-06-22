package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetAllElementsSolution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        getNodeValue(root1, result);
        getNodeValue(root2, result);
        Collections.sort(result);

        return result;
    }

    public void getNodeValue(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);

        getNodeValue(root.left, result);
        getNodeValue(root.right, result);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
