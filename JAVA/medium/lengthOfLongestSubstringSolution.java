package com.quinn.code.medium;

import java.util.Arrays;

//3. 无重复字符的最长子串
public class lengthOfLongestSubstringSolution {

    //    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
//    输入: "abcabcbb"
//    输出: 3
//    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int max = 0;
        int[] temp = new int[1024];
        for (int i = 0; i < s.length() - 1; i++) {
            Arrays.fill(temp, 0);
            char first = s.charAt(i);
            temp[first]++;
            int len = 1;
            for (int j = i + 1; j < s.length(); j++) {
                char next = s.charAt(j);
                if (temp[next] == 0) {
                    len++;
                    temp[next]++;
                } else {
                    break;
                }
            }

            max = Math.max(max, len);
        }


        return max;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abbbbbb");
        System.out.println(result);
        int result2 = lengthOfLongestSubstring("");
        System.out.println(result2);
        int result3 = lengthOfLongestSubstring(" ");
        System.out.println(result3);
    }
}
