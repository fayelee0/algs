package com.pursuetao.algs.grok.topk;

import com.pursuetao.algs.grok.Pair;

import java.util.*;

// 'K' Closest Numbers
//
// Given a sorted number array and two integers ‘K’ and ‘X’, find ‘K’ closest numbers to ‘X’ in the array.
// Return the numbers in the sorted order. ‘X’ is not necessarily present in the array.
public class S8 {
    public static List<Integer> findClosestElements(int[] arr, int K, int X) {
        int index = binarySearch(arr, X);
        int left = Math.max(index - X, 0);
        int right = Math.min(index + X, arr.length - 1);

        PriorityQueue<Pair> maxQ = new PriorityQueue<>(Comparator.comparingInt(o -> o.y));
        for (int i = left; i <= right; i++) {
            maxQ.offer(new Pair(arr[i], Math.abs(arr[i] - X)));
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            result.add(maxQ.poll().x);
        }
        Collections.sort(result);
        return result;
    }

    private static int binarySearch(int[] arr, int X) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == X) {
                return mid;
            } else if (arr[mid] < X) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return (lo > 0) ? (lo - 1) : 0;
    }
}
