package com.lee.StringTOInteger;

public class Solution {
    public int myAtoi(String str) {
        String rev = drawInt(str);
        boolean isPasitive = isPositive(str);
        int i = 0;
        int sum = 0;
        while (i < str.length()) {
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && rev.charAt(i) - '0' > 7)) {
                if (isPasitive)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
            sum = sum * 10 + (rev.charAt(i++) - '0');
        }
        return isPasitive ? -sum : sum;
    }

    public String drawInt(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c: str.toCharArray()) {
            if (c>='0' && c<='9') {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }

    public boolean isPositive(String str) {
        int i = 0;
        if (str.length() == 0) {
            return true;
        }
        while (i<str.length()) {
            if (str.charAt(i) >='0' && str.charAt(i)<='9' && str.charAt(i-1)=='-') {
                return false;
            }
            if (str.charAt(i) >='0' && str.charAt(i)<='9' && i==0) {
                return true;
            }
            if (str.charAt(i) >='0' && str.charAt(i)<='9' && str.charAt(i-1) != '-' ){
                return true;
            }
            i++;
        }
        return false;
    }
}
