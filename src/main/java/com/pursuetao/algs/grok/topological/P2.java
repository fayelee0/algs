package com.pursuetao.algs.grok.topological;

import java.util.*;

// Minimum Height Trees
public class P2 {
    public static List<Integer> findTrees(int nodes, int[][] edges) {
        if (nodes <= 0) {
            return Collections.emptyList();
        }

        if (nodes == 1) {
            return Collections.singletonList(0);
        }

        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < nodes; i++) {
            inDegree.put(i, 0);
            graph.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int V = edge[0];
            int U = edge[1];

            inDegree.put(V, inDegree.get(V) + 1);
            inDegree.put(U, inDegree.get(U) + 1);

            graph.get(U).add(V);
            graph.get(V).add(U);
        }

        Queue<Integer> leaves = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 1) {
                leaves.offer(entry.getKey());
            }
        }

        List<Integer> MHT = new ArrayList<>();
        int _nodes = nodes;
        while (_nodes > 2) {
            int leavesSize = leaves.size();
            _nodes -= leavesSize;
            for (int i = 0; i < leavesSize; i++) {
                int vertex = leaves.poll();
                for (int child : graph.get(vertex)) {
                    inDegree.put(child, inDegree.get(child) - 1);
                    if (inDegree.get(child) == 1) {
                        leaves.offer(child);
                    }
                }
            }
        }

        MHT.addAll(leaves);
        return MHT;
    }
}
