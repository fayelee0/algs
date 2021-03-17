package com.pursuetao.algs.grok.topk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Top 'K' Numbers
//
// Given an unsorted array of numbers, find the ‘K’ largest numbers in it.
public class S1 {
    public static List<Integer> findKLargestNumbers(int[] nums, int K) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(Comparator.comparingInt(o -> o));

        for (int i = 0; i < K; i++) {
            minPQ.offer(nums[i]);
        }

        for (int i = K; i < nums.length; i++) {
            if (nums[i] > minPQ.peek()) {
                minPQ.poll();
                minPQ.offer(nums[i]);
            }
        }

        return new ArrayList<>(minPQ);
    }
}
