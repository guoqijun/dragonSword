package com.quinn.code.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifferenceSolution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minNum = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            minNum = Math.min(minNum, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minNum) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                ret.add(temp);
            }
        }

        return ret;
    }
}
