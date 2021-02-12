package com.pursuetao.algs.grok.slidingwindow;

// Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
public class S0 {
    public static double[] findAverages(int K, int[] arr) {
        double[] ret = new double[arr.length - K + 1];

        int winSum = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            winSum += arr[winEnd];

            if (winEnd >= K - 1) {
                ret[winStart] = winSum * 1.0 / K;
                winSum -= arr[winStart];
                winStart++;
            }
        }

        return ret;
    }
}
