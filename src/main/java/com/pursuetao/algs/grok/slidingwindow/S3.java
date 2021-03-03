package com.pursuetao.algs.grok.slidingwindow;

import java.util.HashMap;
import java.util.Map;

// Longest Substring with K Distinct Characters
//
// Given a string, find the length of the longest substring in it with no more than K distinct characters.
public class S3 {
    public static int findLength(String str, int K) {
        int len = 0;

        Map<Character, Integer> mem = new HashMap<>();
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            char right = str.charAt(winEnd);
            mem.put(right, winEnd);
            if (mem.size() > K) {
                char left = str.charAt(winStart);
                winStart = Math.max(winStart, mem.get(left) + 1);
                mem.remove(left);
            }
            len = Math.max(len, winEnd - winStart + 1);
        }

        return len;
    }
}
