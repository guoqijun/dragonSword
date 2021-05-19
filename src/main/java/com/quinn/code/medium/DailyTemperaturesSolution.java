package com.quinn.code.medium;

import java.util.Stack;

public class DailyTemperaturesSolution {

    public int[] dailyTemperatures2(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; ++i) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int temp = stack.pop();
                res[temp] = i - temp;
            }
            stack.push(i);
        }
        return res;
    }


    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        if (len == 1) {
            temperatures[0] = 0;
            return temperatures;
        }
        int step;
        for (int index = 0; index < len - 1; index++) {
            step = 0;
            for (int right = index + 1; right < len; right++) {
                step++;
                if (temperatures[right] > temperatures[index]) {
                    break;
                }
                if (right == len - 1) {
                    step = 0;
                }
            }

            temperatures[index] = step;
        }
        temperatures[len - 1] = 0;
        return temperatures;
    }
}
