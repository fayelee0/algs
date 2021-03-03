package com.pursuetao.algs.grok.slidingwindow;

import java.util.HashMap;
import java.util.Map;

// Fruits into Baskets
//
// Given an array of characters where each character represents a fruit tree, you are given two baskets, and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.
// You can start with any tree, but you can’t skip a tree once you have started. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
public class S4 {
    public static int findLength(char[] arr) {
        int len = 0;

        Map<Character, Integer> mem = new HashMap<>();
        int winStart = 0;
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            mem.put(arr[winEnd], winEnd);
            if (mem.size() > 2) {
                char c = arr[winStart];
                winStart = Math.max(winStart, mem.get(c) + 1);
                mem.remove(c);
            }
            len = Math.max(len, winEnd - winStart + 1);
        }

        return len;
    }
}
