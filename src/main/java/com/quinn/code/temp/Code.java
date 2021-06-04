package com.quinn.code.temp;

import com.quinn.code.medium.ConvertSolution;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;

public class Code {
    public static void main(String[] args) {
        Code code = new Code();
        int[] A = new int[]{2, 5, 6, 0, 0, 1, 2};

        int result = code.numDifferentIntegers("a1b01c001");

        String s2 = "0002321".replaceAll("^(0+)", "");
        System.out.println(s2);
        System.out.println(result);
    }

    public int countOdds(int low, int high) {
        int count = 0;
        for (int start = low; start <= high; start++) {
            if (isOdd(start)) {
                count++;
            }
        }

        return count;
    }

    public boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public int numDifferentIntegers(String word) {
        Set<String> intSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean intEnd = false;
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) >= 'a' && word.charAt(index) <= 'z') {
                if (intEnd) {
                    intEnd = false;
                    int deleteLen = 0;
                    if (sb.length() >= 2) {
                        for (int j = 0; j < sb.length() - 1; j++) {
                            if (sb.charAt(j) == '0') {
                                deleteLen++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (deleteLen > 0) sb.delete(0, deleteLen);

                    intSet.add((sb.toString()));
                }
                if (sb.length() > 0) {
                    sb.delete(0, sb.length());
                }
            } else {
                intEnd = true;
                sb.append(word.charAt(index));
            }
        }
        if (intEnd && sb.length() > 0) {
            intEnd = false;
            int deleteLen = 0;
            if (sb.length() >= 2) {
                for (int j = 0; j < sb.length() - 1; j++) {
                    if (sb.charAt(j) == '0') {
                        deleteLen++;
                    } else {
                        break;
                    }
                }
            }
            if (deleteLen > 0) sb.delete(0, deleteLen);
            intSet.add((sb.toString()));
        }

        return intSet.size();
    }

    //左右根,后续遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        fuck(root, result);
        return result;
    }

    public void fuck(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            fuck(root.left, result);
        }
        if (root.right != null) {
            fuck(root.right, result);
        }
        result.add(root.val);
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

    public boolean search3(int[] nums, int target) {
        List<Integer> list1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return list1.contains(target);
    }


    public boolean search2(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        if (len == 1) {
            return nums[0] == target;
        }

        while (left != right) {
            if (nums[left] == target || nums[right] == target) {
                return true;
            } else if (nums[left] < target) {
                left++;
            } else if (nums[right] > target) {
                right--;
            } else if (nums[left] > target && nums[right] < target) {
                return false;
            }
        }

        return false;
    }

    public boolean search(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return true;
            }
        }

        return false;
    }

    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int dest = len / 2;
        int last = A[0];
        int count = 1;
        for (int index = 1; index < len; index++) {
            if (A[index] == last) {
                count++;
                if (count == dest) {
                    return A[index];
                }
            } else {
                last = A[index];
                count = 1;
            }
        }

        return 0;
    }


}
