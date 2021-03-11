package com.pursuetao.algs.grok.topk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// Connect Ropes
//
// Given ‘N’ ropes with different lengths, we need to connect these ropes into one big rope with minimum cost.
// The cost of connecting two ropes is equal to the sum of their lengths.
public class S4 {
    public static int minimumCostToConnectRopes(int[] ropeLengths) {
        PriorityQueue<Integer> minQ = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        for (int i = 0; i < ropeLengths.length; i++) {
            minQ.offer(ropeLengths[i]);
        }
        int sum = 0;
        int tmp = 0;
        while (minQ.size() > 1) {
            tmp = minQ.poll() + minQ.poll();
            sum += tmp;
            minQ.offer(tmp);
        }
        return sum;
    }
}
