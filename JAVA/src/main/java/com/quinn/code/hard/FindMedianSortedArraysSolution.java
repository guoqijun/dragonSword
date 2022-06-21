package com.quinn.code.hard;

//4. 寻找两个正序数组的中位数
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
public class FindMedianSortedArraysSolution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0f;
        int len = nums1.length + nums2.length;
        if (len == 1) {
            if (nums1.length == 0) {
                result = nums2[0];
            } else {
                result = nums1[0];
            }

            return result;
        }
        //must have two
        int targetIndex = 0;
        if (len % 2 == 0) {
            //even
            targetIndex = len / 2; //2..
        } else {
            //odd
            targetIndex = len / 2; //3..
        }

        int first = 0;
        int second = 0;
        int count = 0;
        int num1Index = 0;
        int num2Index = 0;
        while (count <= targetIndex) {
            if (num2Index >= nums2.length || (num1Index < nums1.length && nums1[num1Index] < nums2[num2Index])) {
                first = second;
                second = nums1[num1Index];
                num1Index++;
            } else {
                first = second;
                second = nums2[num2Index];
                num2Index++;
            }
            count++;
        }

        if (len % 2 == 0) {
            return (first + second) / 2f;
        } else {
            return second / 1f;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0};
        int[] nums2 = {0};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}
