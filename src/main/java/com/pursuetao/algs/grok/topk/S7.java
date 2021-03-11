package com.pursuetao.algs.grok.topk;

import java.util.Comparator;
import java.util.PriorityQueue;

// Kth Largest Number in a Stream
//
//
public class S7 {
    private PriorityQueue<Integer> minQ = new PriorityQueue<>(Comparator.comparingInt(o -> o));
    private int K = 0;

    public S7(int[] nums, int K) {
        this.K = K;

        for (int i = 0; i < K && i < nums.length; i++) {
            minQ.offer(nums[i]);
        }

        for (int i = K; i < nums.length; i++) {
            if (nums[i] > minQ.peek()) {
                minQ.poll();
                minQ.offer(nums[i]);
            }
        }
    }

    public int add(int num) {
        if (this.K == minQ.size()) {
            if (num > minQ.peek()) {
                minQ.poll();
                minQ.offer(num);
            }
        } else {
            minQ.offer(num);
        }
        return minQ.peek();
    }
}
