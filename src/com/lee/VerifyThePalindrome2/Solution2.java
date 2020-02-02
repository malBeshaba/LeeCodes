package com.lee.VerifyThePalindrome2;
/*双指针-------爽！还是贪心舒服*/
public class Solution2 {
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; j - i > 0; i++, j --) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
