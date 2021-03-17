package com.pursuetao.algs.grok.topological;

import java.util.*;

// Tasks Scheduling Order
public class S3 {
    public static List<Integer> findOrder(int tasks, int[][] prerequisites) {
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> DAG = new HashMap<>();
        for (int i = 0; i < tasks; i++) {
            inDegree.put(i, 0);
            DAG.put(i, new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            int parent = pair[0];
            int child = pair[1];
            inDegree.put(child, inDegree.getOrDefault(child, 0) + 1);
            DAG.get(parent).add(child);
        }

        Queue<Integer> sources = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                sources.offer(entry.getKey());
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!sources.isEmpty()) {
            int parent = sources.poll();
            order.add(parent);
            for (int child : DAG.get(parent)) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    sources.offer(child);
                }
            }
        }

        if (order.size() != tasks) {
            return Collections.emptyList();
        }

        return order;
    }
}
