package com.lee.RomanNumeralsToIntegers;

import java.util.ArrayList;
//拆分？蠢方法
public class Solution {
    public int romanToInt(String s) {
        ArrayList list = stringToList(s);
        int result = 0;
        for (int i = 0; i < list.size(); i ++) {
            result += roman(list.get(i).toString());
        }
        return result;
    }

    public int roman(String s) {
        switch (s) {
            case "I": return 1;
            case "IV": return 4;
            case "V": return 5;
            case "IX": return 9;
            case "X": return 10;
            case "XL": return 40;
            case "L": return 50;
            case "XC": return 90;
            case "C": return 100;
            case "CD": return 400;
            case "D": return 500;
            case "CM":return 900;
            case "M": return 1000;
            default: return 0;
        }
    }

    public ArrayList stringToList(String s) {
        ArrayList list = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer(s);
        while (stringBuffer.length() != 0) {

            if (stringBuffer.length() > 1 && ((stringBuffer.charAt(0) == 'I' && (stringBuffer.charAt(1) == 'V' || stringBuffer.charAt(1) == 'X'))
                    || (stringBuffer.charAt(0) == 'X' && (stringBuffer.charAt(1) == 'L' || stringBuffer.charAt(1) == 'C'))
                    || (stringBuffer.charAt(0) == 'C' && (stringBuffer.charAt(1) == 'D' || stringBuffer.charAt(1) == 'M')))) {
                StringBuffer stringBuffer1 = new StringBuffer();
                stringBuffer1.append(stringBuffer.charAt(0));
                stringBuffer1.append(stringBuffer.charAt(1));
                list.add(stringBuffer1.toString());
                stringBuffer.delete(0,2);
            }else {
                list.add(stringBuffer.charAt(0));
                stringBuffer.deleteCharAt(0);
            }
        }
        return list;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}