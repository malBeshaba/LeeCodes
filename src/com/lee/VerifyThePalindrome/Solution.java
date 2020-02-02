package com.lee.VerifyThePalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        String realString = realString(s);
        for (int i = 0, j = realString.length() - 1; j - i >= 1; i ++, j -- ) {
            if (realString.charAt(i) != realString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public String realString(String s) {
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (isMatch(c)) {
                if (c >= 'A' && c <= 'Z') {c += 32;}
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public boolean isMatch(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {return true;}
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.realString("A man, a plan, a canal: Panama"));
        StringBuffer stringBuffer = new StringBuffer("sssfasjdflk");
        System.out.println(stringBuffer.deleteCharAt(0));
    }
}