package com.lee.lengthOfLongestSubstring;
//不重复的字符串长度
class Solution {
    class Count{
        int max;
    }

    public int lengthOfLongestSubstring(String s) {
        //abcdebe
        Count res = new Count();
        res.max=0;
        char[] array = s.toCharArray();
        search(0,0,array,res);
        return res.max;
    }

    public void search(int begin,int tmp,char[] array,Count res){
        if(array.length == 0){
            return;
        }
        int len = tmp - begin + 1;
        needle: for(int i = tmp + 1;i < array.length;i++){
            for(int j = begin;j < i;j++){
                if(array[i] == array[j]){
                    begin = j + 1;
                    tmp = i;
                    break needle;
                }
            }
            len++;
            if(i == array.length-1){
                tmp = i;
            }
        }
        if(len > res.max){
            res.max = len;
        }
        if((array.length - begin < res.max) || tmp >= array.length - 1 || begin >= array.length -1){
            return;
        }
        search(begin,tmp,array,res);
    }
}