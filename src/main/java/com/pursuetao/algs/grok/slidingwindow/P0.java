package com.pursuetao.algs.grok.slidingwindow;

import java.util.HashMap;
import java.util.Map;

// Given a string and a pattern, find out if the string contains any permutation of the pattern.
public class P0 {
    public static boolean findPermutation(String str, String pattern) {
        Map<Character, Integer> mem = x(pattern);
        for (int winEnd = 0; winEnd < str.length() && mem.size() != 0; winEnd++) {
            char c = str.charAt(winEnd);
            if (mem.containsKey(c)) {
                mem.put(c, mem.get(c) - 1);
                if (mem.get(c) == 0) {
                    mem.remove(c);
                }
            } else {
                mem = x(pattern);
            }
        }
        return mem.size() == 0;
    }

    private static Map<Character, Integer> x(String pattern) {
        Map<Character, Integer> mem = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            mem.put(c, mem.getOrDefault(c, 0) + 1);
        }
        return mem;
    }

    // Time Complexity: O(M + N)
    // Space Complexity: O(M)
    public static boolean findPermutationX(String str, String pattern) {
        Map<Character, Integer> mem = x(pattern);                               // M

        int matched = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {                 // N
            char right = str.charAt(winEnd);
            if (mem.containsKey(right)) {
                int rv = mem.get(right);
                mem.put(right, rv - 1);
                if (rv == 1) {
                    matched++;
                }
            }

            if (matched == mem.size()) {
                return true;
            }

            if (winEnd >= pattern.length() - 1) {
                char left = str.charAt(winStart);
                if (mem.containsKey(left)) {
                    int lv = mem.get(left);
                    if (lv == 0) {
                        matched--;
                    }
                    mem.put(left, lv + 1);
                }
                winStart++;
            }
        }

        return false;
    }
}
