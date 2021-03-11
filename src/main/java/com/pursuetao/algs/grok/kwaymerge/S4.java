package com.pursuetao.algs.grok.kwaymerge;

import com.pursuetao.algs.grok.Pair;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Smallest Number Range
//
// Given ‘M’ sorted arrays, find the smallest range that includes at least one number from each of the ‘M’ lists.
public class S4 {
    public static int[] findSmallestRange(List<Integer[]> lists) {
        int rangeMax = Integer.MIN_VALUE;
        PriorityQueue<Pair> minPQ = new PriorityQueue<>(Comparator.comparingInt(o -> lists.get(o.x)[o.y]));
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null && lists.get(i).length != 0) {
                minPQ.offer(new Pair(i, 0));
                rangeMax = Math.max(rangeMax, lists.get(i)[0]);
            }
        }

        int rangeStart = 0;
        int rangeEnd = Integer.MAX_VALUE;
        Pair pair = null;
        while (minPQ.size() == lists.size()) {
            pair = minPQ.poll();
            if (rangeEnd - rangeStart > rangeMax - lists.get(pair.x)[pair.y]) {
                rangeStart = lists.get(pair.x)[pair.y];
                rangeEnd = rangeMax;
            }
            pair.y++;
            if (lists.get(pair.x).length > pair.y) {
                minPQ.offer(pair);
                rangeMax = Math.max(rangeMax, lists.get(pair.x)[pair.y]);
            }
        }
        return new int[]{rangeStart, rangeEnd};
    }
}
