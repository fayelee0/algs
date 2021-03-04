package com.pursuetao.algs.grok.bitwise;

// Single Number
//
// In a non-empty array of integers, every number appears twice except for one, find that single number.
public class S2 {
    public static int findSingleNumber(int[] arr) {
        int n = 0;
        for (int v : arr) {
            n ^= v;
        }
        return n;
    }
}
