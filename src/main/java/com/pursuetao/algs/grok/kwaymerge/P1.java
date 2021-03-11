package com.pursuetao.algs.grok.kwaymerge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// K Pairs with Largest Sums
//
// Given two sorted arrays in descending order, find ‘K’ pairs with the largest sum where each pair consists of numbers from both the arrays.
public class P1 {
    public static List<int[]> findKLargestPairs(int[] nums1, int[] nums2, int K) {
        PriorityQueue<int[]> minPQ = new PriorityQueue<>(Comparator.comparingInt(o -> o[0] + o[1]));

        for (int i = 0; i < nums1.length && i < K; i++) {
            for (int j = 0; j < nums2.length && j < K; j++) {
                if (minPQ.size() < K) {
                    minPQ.add(new int[]{nums1[i], nums2[j]});
                } else {
                    if (nums1[i] + nums2[j] < minPQ.peek()[0] + minPQ.peek()[1]) {
                        break;
                    } else {
                        minPQ.poll();
                        minPQ.add(new int[]{nums1[i], nums2[j]});
                    }
                }
            }
        }

        return new ArrayList<>(minPQ);
    }
}
