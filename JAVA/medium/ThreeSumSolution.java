package medium;

import java.util.*;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
//        注意：答案中不可以包含重复的三元组。

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
        Set result = new HashSet();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                return new ArrayList<>(result);
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if ((nums[i] + nums[l] + nums[r]) > 0) {
                    r--;
                } else if ((nums[i] + nums[l] + nums[r]) < 0) {
                    l++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                    l++;
                }
            }
        }

        return new ArrayList<>(result);
    }


    public static void main(String[] args) {
        int[] fuck = {-1, 0, 1, 2, -1, -4};
        ThreeSumSolution threeSumSolution = new ThreeSumSolution();
        List<List<Integer>> result = threeSumSolution.threeSum(fuck);

        System.out.println(result.toString());
    }
}
