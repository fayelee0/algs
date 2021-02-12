package com.pursuetao.algs.grok.slidingwindow;

// Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.
public class S7 {
    public static int findLength(int[] arr, int K) {
        int len = 0;

        int ones = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            if (arr[winEnd] == 1) {
                ones++;
            }

            while (winEnd - winStart + 1 - ones > K) {
                if (arr[winStart] == 1) {
                    ones--;
                }
                winStart++;
            }

            len = Math.max(len, winEnd - winStart + 1);
        }

        return len;
    }
}
