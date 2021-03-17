package com.pursuetao.algs.grok.topk;

import java.util.PriorityQueue;

// Kth Smallest Number
//
// Given an unsorted array of numbers, find Kth smallest number in it.
// Please note that it is the Kth smallest number in the sorted order, not the Kth distinct element.
public class S2 {
    public static int findKthSmallestNumber(int[] nums, int k) {
        PriorityQueue<Integer> maxQ = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < k; i++) {
            maxQ.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] < maxQ.peek()) {
                maxQ.poll();
                maxQ.offer(nums[i]);
            }
        }

        return maxQ.peek();
    }
}
