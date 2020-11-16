package com.quinn.code.medium;

//5. 最长回文子串
//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
//示例 1：
//
//输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
public class LongestPalindromeSolution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        String maxStr = s.substring(0, 1);
        boolean result;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                result = isMaxStr(s, i, j);
                if (result) {
                    if (s.substring(i, j+1).length() > maxStr.length()) {
                        maxStr = s.substring(i, j + 1);
                    }
                    break;
                }
            }
        }

        return maxStr;
    }

    public boolean isMaxStr(String s, int start, int end) {
        while (true) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            if ((end - start) > 2) {
                end--;
                start++;
            } else {
                return true;
            }

        }
    }

    public static void main(String[] args) {
        LongestPalindromeSolution longestPalindromeSolution = new LongestPalindromeSolution();
        String result = longestPalindromeSolution.longestPalindrome("cbbd");
        System.out.println(result);
    }
}
