package com.pursuetao.algs.grok.slidingwindow;

import java.util.HashMap;
import java.util.Map;

// Smallest Window containing Substring
// Given a string and a pattern, find the smallest substring in the given string which has all the characters of the given pattern.
public class P2 {
    public static String findSubString(String str, String pattern) {
        Map<Character, Integer> mem = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            mem.put(c, mem.getOrDefault(c, 0) + 1);
        }

        int matched = 0;
        int min = str.length() + 1;
        int minStart = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            char right = str.charAt(winEnd);
            if (mem.containsKey(right)) {
                mem.put(right, mem.get(right) - 1);
                if (mem.get(right) == 0) {
                    matched++;
                }
            }

            while (matched == mem.size()) {
                if (winEnd - winStart + 1 < min) {
                    min = winEnd - winStart + 1;
                    minStart = winStart;
                }

                char left = str.charAt(winStart);
                if (mem.containsKey(left)) {
                    mem.put(left, mem.get(left) + 1);
                    if (mem.get(left) > 0) {
                        matched--;
                    }
                }
                winStart++;
            }
        }

        if (min == str.length() + 1) {
            return "";
        } else {
            return str.substring(minStart, minStart + min);
        }
    }
}
