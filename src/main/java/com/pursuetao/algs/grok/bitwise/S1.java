package com.pursuetao.algs.grok.bitwise;

public class S1 {
    public static int findMissingNumber(int[] arr) {
        int S = arr.length * 2 + 1;
        for (int i = 0; i < arr.length; i++) {
            S = S + i - arr[i];
        }
        return S;
    }

    public static int findMissingNumber2(int[] arr) {
        int S = (arr.length + 1) ^ arr.length;
        for (int i = 0; i < arr.length; i++) {
            S = S ^ i ^ arr[i];
        }
        return S;
    }
}
