package com.quinn.code.easy;

import com.quinn.code.medium.ConvertSolution;

public class ReverseSolution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int flag = 0;
        if (x < 0) {
            x = x * -1;
            flag = 1;
        }
        StringBuilder result = new StringBuilder();
        int next = x;
        int haha = 0;
        do {
            haha = next % 10;
            next = next / 10;

            if (result.length() == 0 && haha == 0) {

            } else {
                result.append(haha);
            }
        } while (next != 0);

        if (flag == 1) {
            return Integer.parseInt(result.toString()) * -1;
        } else {
            return Integer.parseInt(result.toString());
        }
    }

    public static void main(String[] args) {
        ReverseSolution reverse = new ReverseSolution();
        int result = reverse.reverse(96463243);
        System.out.println(result);
    }
}
