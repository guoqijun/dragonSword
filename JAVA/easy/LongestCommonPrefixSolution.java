package com.quinn.code.easy;

public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        int minLen = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        boolean flag = true;
        for (int i = 0; i < minLen + 1; i++) {
            String temp = strs[0].substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(temp)) {
                    flag = false;
                }
            }

            if (flag) {
                result = temp;
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefixSolution isPalindromeSolution = new LongestCommonPrefixSolution();
        String result = isPalindromeSolution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(result);
    }
}
