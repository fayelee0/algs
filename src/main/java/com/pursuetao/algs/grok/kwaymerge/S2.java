package com.pursuetao.algs.grok.kwaymerge;

import com.pursuetao.algs.grok.Pair;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Kth Smallest Number in M Sorted Lists
//
// Given ‘M’ sorted arrays, find the K’th smallest number among all the arrays.
public class S2 {
    public static int findKthSmallest(List<Integer[]> lists, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> lists.get(o.x)[o.y]));
        for (int i = 0; i < lists.size(); i++) {
            Integer[] item = lists.get(i);
            if (item.length != 0) {
                minHeap.offer(new Pair(i, 0));
            }
        }

        int result = 0;
        int count = 0;
        while (!minHeap.isEmpty()) {
            Pair pair = minHeap.poll();
            result = lists.get(pair.x)[pair.y];
            count++;
            if (count == k) {
                break;
            }

            pair.y++;
            if (lists.get(pair.x).length > pair.y) {
                minHeap.add(pair);
            }
        }
        return result;
    }
}
