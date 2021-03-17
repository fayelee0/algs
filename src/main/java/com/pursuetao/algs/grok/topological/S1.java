package com.pursuetao.algs.grok.topological;

import java.util.*;

// Topological Sort
//
//
public class S1 {
    public static List<Integer> sort(int vertices, int[][] edges) {
        List<Integer> sortedOrder = new ArrayList<>();
        if (vertices <= 0) {
            return sortedOrder;
        }

        // a. Initialize the graph
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            inDegree.put(i, 0);
            graph.put(i, new ArrayList<>());
        }

        // b. Build the graph
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            graph.get(parent).add(child);
            inDegree.put(child, inDegree.get(child) + 1);
        }

        // c. Find all sources
        Queue<Integer> sources = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                sources.offer(entry.getKey());
            }
        }

        // d. loop
        while (!sources.isEmpty()) {
            int vertex = sources.poll();
            sortedOrder.add(vertex);

            List<Integer> children = graph.get(vertex);
            for (Integer child : children) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    sources.offer(child);
                }
            }
        }

        if (sortedOrder.size() != vertices) {
            return Collections.emptyList();
        }

        return sortedOrder;
    }
}
