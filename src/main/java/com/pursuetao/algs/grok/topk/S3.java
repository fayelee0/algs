package com.pursuetao.algs.grok.topk;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// 'K' Closest Points to the Origin
//
// Given an array of points in the a 2D2D2D plane, find ‘K’ closest points to the origin.
public class S3 {
    public static List<Point> findClosestPoints(Point[] points, int K) {
        PriorityQueue<Point> maxQ = new PriorityQueue<>(((o1, o2) -> o2.distance() - o1.distance()));

        for (int i = 0; i < K; i++) {
            maxQ.offer(points[i]);
        }

        for (int i = K; i < points.length; i++) {
            if (points[i].distance() < maxQ.peek().distance()) {
                maxQ.poll();
                maxQ.offer(points[i]);
            }
        }

        return new ArrayList<>(maxQ);
    }
}
