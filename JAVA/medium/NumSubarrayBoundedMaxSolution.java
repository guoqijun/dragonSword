package medium;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.List;

public class NumSubarrayBoundedMaxSolution {
    public static void main(String[] args) {
        NumSubarrayBoundedMaxSolution fuck = new NumSubarrayBoundedMaxSolution();
        int[] A = new int[]{73, 55, 36, 5, 55, 14, 9, 7, 72, 52};
        int result = fuck.numSubarrayBoundedMax(A, 32, 69);
        System.out.println(result);
    }

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int result = 0;
        int len = nums.length;
        int tempMax = 0;
        for (int index = 0; index < len; index++) {
            tempMax = 0;
            for (int j = index; j < len; j++) {
                tempMax = Math.max(tempMax, nums[j]);
                if (tempMax >= left && tempMax <= right) {
                    result++;
                }
            }

        }

        return result;
    }
}
