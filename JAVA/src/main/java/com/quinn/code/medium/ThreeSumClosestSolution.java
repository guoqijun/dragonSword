package com.quinn.code.medium;

public class ThreeSumClosestSolution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs((nums[i] + nums[j] + nums[k]) - target) < Math.abs(result - target)) {
                        result = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }

        return result;
    }
}
