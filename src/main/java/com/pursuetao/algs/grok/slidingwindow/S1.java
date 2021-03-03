package com.pursuetao.algs.grok.slidingwindow;

// Maximum Sum Subarray of Size K
//
// Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
public class S1 {
    public static int findMaxSumSubArray(int K, int[] arr) {
        int max = 0;

        int winSum = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            winSum += arr[winEnd];

            if (winEnd >= K - 1) {
                max = Math.max(max, winSum);
                winSum -= arr[winStart];
                winStart++;
            }
        }

        return max;
    }
}
