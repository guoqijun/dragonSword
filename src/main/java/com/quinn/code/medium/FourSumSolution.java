package com.quinn.code.medium;

import java.util.*;

public class FourSumSolution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set result = new HashSet();
        if (nums.length < 4) {
            return new ArrayList<>(result);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            for (int i2 = i + 1; i2 < nums.length - 2; i2++) {
                int l = i2 + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if ((nums[i] + nums[i2] + nums[l] + nums[r]) > target) {
                        r--;
                    } else if ((nums[i] + nums[i2] + nums[l] + nums[r]) < target) {
                        l++;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[i2]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        result.add(temp);
                        l++;
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] fuck = {1, -2, -5, -4, -3, 3, 3, 5};
        FourSumSolution threeSumSolution = new FourSumSolution();
        List<List<Integer>> result = threeSumSolution.fourSum(fuck, -11);

        System.out.println(result.toString());
    }
}
