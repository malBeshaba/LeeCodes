package com.lee.FindMedianSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int helf = (length1 + length2) / 2;
        boolean a = (length1 + length2) % 2 > 0;
        int i = 0, j = 0, k = 0;
        int num[] = new int[helf + 1];
        while (k < helf + 1 && i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                num[k] = nums1[i];
                i++;
            } else {
                num[k] = nums2[j];
                j++;
            }
            k ++;
        }
        System.out.println(Arrays.toString(num));
        if (a) return num[helf];
        else return (num[helf-1] + num[helf])/2.0;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3, 4}, new int[]{2}));
    }
}