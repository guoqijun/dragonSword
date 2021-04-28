package com.quinn.code.temp;

import com.quinn.code.medium.ConvertSolution;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code {
    public static void main(String[] args) {
        Code code = new Code();
        int[] A = new int[]{2, 5, 6, 0, 0, 1, 2};


        boolean result = code.search2(A, 4);
        System.out.println(result);
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
