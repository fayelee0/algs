package com.pursuetao.algs.grok.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Given a string, find the length of the longest substring, which has no repeating characters.
public class S5 {
    public static int findLength(String str) {
        int len = 0;

        Set<Character> mem = new HashSet<>();
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            while (mem.contains(str.charAt(winEnd))) {
                mem.remove(str.charAt(winStart));
                winStart++;
            }
            mem.add(str.charAt(winEnd));
            len = Math.max(len, winEnd - winStart + 1);
        }

        return len;
    }

    public static int findLengthX(String str) {
        int len = 0;

        Map<Character, Integer> mem = new HashMap<>();
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            char right = str.charAt(winEnd);
            if (mem.containsKey(right)) {
                winStart = Math.max(winStart, mem.get(right) + 1);
            }
            mem.put(right, winEnd);
            len = Math.max(len, winEnd - winStart + 1);
        }

        return len;
    }
}
