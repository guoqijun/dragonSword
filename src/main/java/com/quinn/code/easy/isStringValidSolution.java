package com.quinn.code.easy;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

import java.util.Stack;

public class isStringValidSolution {
    public boolean isValid(String s) {
        Stack<String> fuck = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char shit = s.charAt(i);
            if (shit == '(') {
                fuck.push("(");
            } else if (shit == '{') {
                fuck.push("{");
            } else if (shit == '[') {
                fuck.push("[");
            } else if (shit == ')') {
                if (fuck.size() == 0 || !fuck.pop().equals("(")) {
                    return false;
                }
            } else if (shit == '}') {
                if (fuck.size() == 0 || !fuck.pop().equals("{")) {
                    return false;
                }
            } else if (shit == ']') {
                if (fuck.size() == 0 || !fuck.pop().equals("[")) {
                    return false;
                }
            }
        }

        if (fuck.size() > 0) {
            return false;
        }


        return true;
    }
}
