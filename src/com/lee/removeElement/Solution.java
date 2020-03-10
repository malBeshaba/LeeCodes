package com.lee.removeElement;

import java.util.Arrays;

public class Solution {
    public int removeElement1(int[] nums, int val) {
        int length = nums.length;
        System.out.println(length);
        lab: for (int i = 0; i < nums.length; i ++) {
            while (nums[i] == val) {
                length--;
                for (int j = i; j < nums.length - 1; j ++) {
                    nums[j] = nums[j + 1];
                }
                if (i == length) break lab;
            }
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }

    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement3(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeElement1(new int[]{1,2,2,4,2}, 2));
    }
}
