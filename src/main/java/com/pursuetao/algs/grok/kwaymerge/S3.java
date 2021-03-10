package com.pursuetao.algs.grok.kwaymerge;

import com.pursuetao.algs.grok.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

// Kth Smallest Number in a Sorted Matrix
//
// Given an N*N matrix where each row and column is sorted in ascending order, find the Kth smallest element in the matrix.
public class S3 {
    public static int findKthSmallest(int[][]matrix, int K) {
        PriorityQueue<Pair> minPQ = new PriorityQueue<>(Comparator.comparingInt(o -> matrix[o.x][o.y]));
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            if (row.length != 0) {
                minPQ.offer(new Pair(i, 0));
            }
        }

        int result = 0;
        int count = 0;
        Pair pair = null;
        while (!minPQ.isEmpty()) {
            pair = minPQ.poll();
            result = matrix[pair.x][pair.y];
            count++;
            if (count >= K) {
                break;
            }
            pair.y++;
            if (matrix[pair.x].length > pair.y) {
                minPQ.offer(pair);
            }
        }
        return result;
    }
}
