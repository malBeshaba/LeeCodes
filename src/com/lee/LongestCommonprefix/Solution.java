package com.lee.LongestCommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = "";
        int length = strs[0].length();
        String s = strs[0];
        for (String string: strs) {
            if (string.length() < length) {
                length = string.length();
                s = string;
            }
        }
        for (int i = 0; i <= length; i ++) {
            String temp = s.substring(0, i);
            for (int j = 0; j < strs.length; j ++) {
                if (!isPrefix(temp, strs[j])) {
                    return prefix;
                }
            }
            prefix = temp;
        }
        return prefix;
    }

    public boolean isPrefix(String prefix, String string) {
        if (prefix.equals(string.substring(0, prefix.length()))) {
            return true;
        }
        return false;
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.isPrefix("a","apple"));
        System.out.println(solution.longestCommonPrefix(new String[]{"aa", "a"}));
    }
}