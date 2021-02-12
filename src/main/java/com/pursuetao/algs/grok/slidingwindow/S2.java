package com.pursuetao.algs.grok.slidingwindow;

// Given an array of positive numbers and a positive number ‘S,’ find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists.
public class S2 {
    public static int findMinSubArray(int S, int[] arr) {
        int min = arr.length + 1;

        int winSum = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            winSum += arr[winEnd];

            while (winSum >= S) {
                min = Math.min(min, winEnd - winStart + 1);
                winSum -= arr[winStart];
                winStart++;
            }
        }

        return (min == arr.length + 1) ? 0 : min;
    }
}
