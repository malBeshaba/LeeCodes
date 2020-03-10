package com.lee.DistributeCandies;

import java.util.Arrays;

public class Solution {
    //暴力求解
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int point = 0;
        int candy = 1;
        while (candies > 0) {
            result[point] += candy;
            point = (point + 1) % num_people;
            candies -= candy;
            candy = Math.min((candy + 1), candies);
        }
        return result;
    }

    //数学解法
    public int[] distributeCandies2(int candies, int num_people) {
        int n = num_people;
        // how many people received complete gifts
        int p = (int)(Math.sqrt(2 * candies + 0.25) - 0.5);
        int remaining = (int)(candies - (p + 1) * p * 0.5);
        int rows = p / n, cols = p % n;
        int[] d = new int[n];
        for(int i = 0; i < n; ++i) {
            // complete rows
            d[i] = (i + 1) * rows + (int)(rows * (rows - 1) * 0.5) * n;
            // cols in the last row
            if (i < cols) d[i] += i + 1 + rows * n;
        }
        // remaining candies
        d[cols] += remaining;
        return d;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.distributeCandies(7, 4)));
    }
}
