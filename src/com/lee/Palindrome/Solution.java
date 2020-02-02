package com.lee.Palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        String integer = String.valueOf(x);
        for (int i = 0, j = integer.length() - 1; j - i >= 1; i ++, j--) {
            if (integer.charAt(i) != integer.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
