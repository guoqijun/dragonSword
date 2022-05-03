package com.quinn.code.easy;

public class PrintNumbersSolution {
    public int[] printNumbers(int n) {
        int s = 1;
        while (n > 0) {
            n--;
            s = s * 10;
        }

        s = s - 1;
        int[] ret = new int[s];
        for (int i = 0; i < s; i++) {
            ret[i] = i+1;
        }

        return ret;
    }
}
