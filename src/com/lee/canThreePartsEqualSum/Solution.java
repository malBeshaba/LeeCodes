package com.lee.canThreePartsEqualSum;

public class Solution {
    /*形式上，如果可以找出索引 i+1 < j 
    且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。*/
    public boolean canThreePartsEqualSum(int[] A) {
        boolean result = false;
        int sumA = A[0], sumB = A[A.length - 1];
        int i = 0, j = A.length - 1;
        while (i + 1 < j) {
            if (sumA == sumB) {
                int sumC = 0;
                for (int k = i + 1; k < j; k ++) {
                    sumC += A[k];
                }
                if (sumC == sumA) return true;
                else i++;
            } else if (sumA < sumB) {
                sumA += A[++i];
            } else {
                sumB += A[--j];
            }
        }
        return result;
    }
}
