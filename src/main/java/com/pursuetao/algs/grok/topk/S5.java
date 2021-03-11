package com.pursuetao.algs.grok.topk;

import com.pursuetao.algs.grok.Pair;

import java.util.*;

// Top 'K' Frequent Numbers
//
// Given an unsorted array of numbers, find the top ‘K’ frequently occurring numbers in it.
public class S5 {
    public static List<Integer> findTopKFrequentNumbers(int[] nums, int K) {
        Map<Integer, Integer> mem = new HashMap<>();
        for (int n : nums) {
            mem.put(n, mem.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Pair> minQ = new PriorityQueue<>(Comparator.comparingInt(o -> o.y));
        for (Map.Entry<Integer, Integer> entry : mem.entrySet()) {
            minQ.offer(new Pair(entry.getKey(), entry.getValue()));
            if (minQ.size() > K) {
                minQ.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!minQ.isEmpty()) {
            result.add(minQ.poll().x);
        }
        return result;
    }
}
