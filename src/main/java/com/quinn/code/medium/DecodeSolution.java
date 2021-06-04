package com.quinn.code.medium;

import java.util.*;

public class DecodeSolution {
    public static void main(String[] args) {
        DecodeSolution convertSolution = new DecodeSolution();
        int[] result = convertSolution.decode(new int[]{3, 1});
        System.out.println(Arrays.toString(result));
    }

    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        Set<Integer> temp = new HashSet<>();

        for (int index = 1; index < n; index++) {
            perm[0] = index;
            temp.add(index);
            for (int j = 1; j < n; j++) {
                perm[j] = perm[j - 1] ^ encoded[j - 1];
                if (perm[j] > n || temp.contains(perm[j]) || perm[j] < 1) {
                    temp.clear();
                    break;
                } else {
                    temp.add(perm[j]);
                }
            }
            if (temp.size() == n) {
                return perm;
            }
        }

        return perm;
    }

    public int[] decode2(int[] encoded) {
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] perm = new int[n];
        perm[0] = total ^ odd;
        for (int i = 0; i < n - 1; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;

    }
}
