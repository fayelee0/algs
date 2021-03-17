package com.pursuetao.algs.grok.topk;

import com.pursuetao.algs.grok.Pair;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Frequency Sort
//
// Given a string, sort it based on the decreasing frequency of its characters.
public class S6 {
    public static String sortCharacterByFrequency(String str) {
        Map<Character, Integer> mem = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            mem.put(str.charAt(i), mem.getOrDefault(str.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxQ = new PriorityQueue<>(Comparator.comparing(o -> -o.getValue()));
        maxQ.addAll(mem.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!maxQ.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxQ.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
