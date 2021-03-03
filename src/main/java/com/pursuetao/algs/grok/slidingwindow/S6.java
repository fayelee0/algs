package com.pursuetao.algs.grok.slidingwindow;

import java.util.HashMap;
import java.util.Map;

// Longest Substring with Same Letters after Replacement
//
// Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters with any letter, find the length of the longest substring having the same letters after replacement.
public class S6 {
    public static int findLength(String str, int K) {
        int len = 0;

        Map<Character, Integer> mem = new HashMap<>();
        int maxCount = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            char right = str.charAt(winEnd);
            mem.put(right, mem.getOrDefault(right, 0) + 1);
            maxCount = Math.max(maxCount, mem.get(right));

            if (winEnd - winStart + 1 - maxCount > K) {
                char left = str.charAt(winStart);
                mem.put(left, mem.get(left) - 1);
                winStart++;
            }

            len = Math.max(len, winEnd - winStart + 1);
        }

        return len;
    }
}
