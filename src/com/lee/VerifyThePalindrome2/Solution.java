package com.lee.VerifyThePalindrome2;

import java.util.ArrayList;
/*暴力破解--------超时*/
public class Solution {
    //abca
    //abbca
    public boolean validPalindrome(String s) {
        ArrayList list = allList(s);
        for (int i = 0; i < list.size(); i ++) {
            if (isPalindrome(list.get(i).toString())) {
                return true;
            }
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; j - i >= 1; i ++, j -- ) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList allList(String s) {
        ArrayList list = new ArrayList();

        list.add(s);
        for (int i = 0; i < s.length(); i ++) {
            StringBuffer stringBuffer = new StringBuffer(s);
            list.add(stringBuffer.deleteCharAt(i).toString());
        }
        return list;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.allList("abca"));
    }
}