package com.quinn.code.medium;

public class DailyTemperaturesSolution {
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
