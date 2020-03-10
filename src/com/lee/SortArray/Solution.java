package com.lee.SortArray;

public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        while (m > 0 && n > 0) {
            A[m + n - 1] = A[m - 1] > B[n - 1] ? A[m-- - 1] : B[n-- - 1];
        }
        while (n > 0) {
            A[n - 1] = B[n - 1];
            n--;
        }
    }
}
