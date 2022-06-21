package com.quinn.code.easy;
import java.util.*;

public class HUAER3Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int k = sc.nextInt();
        List<Integer> nums = help(text, ',');
        Collections.sort(nums);
        if (k == 0 || nums.size() == 0 || nums.size() < k) {
            return;
        }
        int[] numss = new int[nums.size()];
        int index = 0;
        for (Integer item :
                nums) {
            numss[index++] = item;
        }
        List<String> result = new ArrayList<>();
        gg(result, "", k, numss, 0);

        for (String item : result) {
            System.out.println(item);
        }
    }

    public static void gg(List<String> result, String one, int k, int[] nums, int index) {
        for (int i = index; i < nums.length; i++) {
            if (count(one) >= k) {
                result.add(one + nums[i]);
            }
            gg(result, one + nums[i] + ",", k, nums, i + 1);
        }
    }

    public static int count(String str) {
        int count = 1;
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == ',') {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> help(String str, char de) {
        StringBuilder num = new StringBuilder();
        List<Integer> ret = new ArrayList<>();
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == de) {
                int ont = Integer.parseInt(num.toString());
                if (!ret.contains(ont)) {
                    ret.add(ont);
                }
                num.delete(0, num.length());
            } else {
                num.append(str.charAt(index));
            }
        }

        ret.add(Integer.parseInt(num.toString()));
        return ret;
    }
}
