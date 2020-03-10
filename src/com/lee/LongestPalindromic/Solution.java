package com.lee.LongestPalindromic;
//最长公共子串解法
public class Solution {
    public String longestPalindrome(String s) {
        if (s.equals(""))
            return "";
        String origin = s;
        String reverse = new StringBuffer(s).reverse().toString();
        int length = s.length();
        int[] arr = new int[length];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < length; i++)
            for (int j = length - 1; j >= 0; j--) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[j] = 1;
                    } else {
                        arr[j] = arr[j - 1] + 1;
                    }
                    //之前二维数组，每次用的是不同的列，所以不用置 0 。
                } else {
                    arr[j] = 0;
                }
                if (arr[j] > maxLen) {
                    int beforeRev = length - 1 - j;
                    if (beforeRev + arr[j] - 1 == i) {
                        maxLen = arr[j];
                        maxEnd = i;
                    }

                }
            }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
    }
}