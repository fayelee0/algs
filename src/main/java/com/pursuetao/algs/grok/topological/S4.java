package com.pursuetao.algs.grok.topological;

import java.util.*;

// All Tasks Scheduling Orders
public class S4 {
    public static List<List<Integer>> orders(int tasks, int[][] prerequisites) {
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

        if (sources.isEmpty()) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        orders(DAG, inDegree, sources, new ArrayList<>(), result);
        return result;
    }

    private static void orders(Map<Integer, List<Integer>> DAG, Map<Integer, Integer> inDegree, Queue<Integer> sources, List<Integer> path, List<List<Integer>> result) {
        for (int vertex : sources) {
            List<Integer> newPath = new ArrayList<>(path);
            newPath.add(vertex);
            Queue<Integer> nextSources = new LinkedList<>(sources);
            nextSources.remove(vertex);
            for (int child : DAG.get(vertex)) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    nextSources.offer(child);
                }
            }
            orders(DAG, inDegree, nextSources, newPath, result);
            for (int child : DAG.get(vertex)) {
                inDegree.put(child, inDegree.get(child) + 1);
            }
        }
        if (path.size() == inDegree.size()) {
            result.add(path);
        }
    }
}
