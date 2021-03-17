package com.pursuetao.algs.grok.topological;

import java.util.*;

// Tasks Scheduling
public class S2 {
    public static boolean isSchedulingPossible(int tasks, int[][] prerequisites) {
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < tasks; i++) {
            inDegree.put(i, 0);
            graph.put(i, new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            int parent = pair[0];
            int child = pair[1];
            inDegree.put(child, inDegree.getOrDefault(child, 0) + 1);
            graph.get(parent).add(child);
        }

        Queue<Integer> sources = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                sources.offer(entry.getKey());
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!sources.isEmpty()) {
            int vertex = sources.poll();
            order.add(vertex);
            for (Integer child : graph.get(vertex)) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    sources.offer(child);
                }
            }
        }

        return order.size() == tasks;
    }
}
