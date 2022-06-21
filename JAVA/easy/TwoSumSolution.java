package com.quinn.code.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1. 两数之和
public class TwoSumSolution {
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }

            map.put(nums[i], i);
        }

        return result;

//        List<Integer> notPossible = new ArrayList<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (notPossible.contains(nums[i])) {
//                continue;
//            }
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//            notPossible.add(nums[i]);
//        }

//        return result;
    }
}
