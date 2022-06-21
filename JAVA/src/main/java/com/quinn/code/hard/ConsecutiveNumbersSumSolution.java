package com.quinn.code.hard;

public class ConsecutiveNumbersSumSolution {
    public static void main(String[] args) {
        ConsecutiveNumbersSumSolution code = new ConsecutiveNumbersSumSolution();
        int result = code.consecutiveNumbersSum(15);
        System.out.println(result);
    }

    public int consecutiveNumbersSum(int n) {
        int count = 0;
        int sum;
        for (int index = 1; index <= n; index++) {
            sum = 0;
            for (int j = index; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    count++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }

        }

        return count;
    }
}
