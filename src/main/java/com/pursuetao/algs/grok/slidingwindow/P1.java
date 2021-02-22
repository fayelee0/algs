package com.pursuetao.algs.grok.slidingwindow;

import java.util.*;

// Given a string and a pattern, find all anagrams of the pattern in the given string.
//
// Write a function to return a list of starting indices of the anagrams of the pattern in the given string.
public class P1 {
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> ret = new ArrayList<>();

        Map<Character, Integer> mem = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            mem.put(c, mem.getOrDefault(c, 0) + 1);
        }

        int matched = 0;
        int winStart = 0;
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            char R = str.charAt(winEnd);
            if (mem.containsKey(R)) {
                mem.put(R, mem.get(R) - 1);
                if (mem.get(R) == 0) {
                    matched++;
                }
            }

            if (matched == mem.size()) {
                ret.add(winStart);
            }

            if (winEnd >= pattern.length() - 1) {
                char L = str.charAt(winStart);
                if (mem.containsKey(L)) {
                    if (mem.get(L) == 0) {
                        matched--;
                    }
                    mem.put(L, mem.get(L) + 1);
                }
                winStart++;
            }
        }

        return ret;
    }
}
