package com.lee.ZWord;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String convert(String s, int numRows) {
        ArrayList[] a = new ArrayList[numRows];
        for (int i = 0; i < numRows; i ++) {
            a[i] = new ArrayList();
        }
        int[] array = array(numRows);
        int i;
        for (i = 0; i < s.length(); i ++) {
            System.out.println("arrayNum:"+i%array.length);
            System.out.println("arrayConnect:"+array[i%array.length]);

            a[array[i%array.length]].add(s.charAt(i));
        }
        StringBuffer str = new StringBuffer();
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < a[j].size(); k++) {
                str.append(a[j].get(k));
            }
        }
        return str.toString();
    }

    public int[] array(int numRows) {
        if (numRows == 1) return new int[]{0};
        int num = numRows * 2 - 2;
        int[] ar = new int[num];
        for (int i = 0; i < num; i ++) {
            if (i < numRows) {
                ar[i] = i;
            }else {
                ar[i] = num - i;
            }
        }
        System.out.println(Arrays.toString(ar));
        return ar;
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("A",1));
    }
}