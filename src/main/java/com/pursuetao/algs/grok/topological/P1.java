package com.pursuetao.algs.grok.topological;

import java.util.*;

// Reconstructing a Sequence
public class P1 {
    public static boolean canConstruct(int[] originalSeq, int[][] sequences) {
        if (originalSeq == null || originalSeq.length == 0) {
            return false;
        }

        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> DAG = new HashMap<>();
        for (int[] sequence : sequences) {
            for (int i = 0; i < sequence.length; i++) {
                inDegree.putIfAbsent(sequence[i], 0);
                DAG.putIfAbsent(sequence[i], new ArrayList<>());
            }
        }

        if (inDegree.size() != originalSeq.length) {
            return false;
        }

        for (int[] sequence : sequences) {
            for (int i = 1; i < sequence.length; i++) {
                int parent = sequence[i - 1];
                int child = sequence[i];
                inDegree.put(child, inDegree.get(child) + 1);
                DAG.get(parent).add(child);
            }
        }

        Queue<Integer> sources = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                sources.offer(entry.getKey());
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!sources.isEmpty()) {
            if (sources.size() > 1) {
                return false;
            }
            if (originalSeq[order.size()] != sources.peek()) {
                return false;
            }
            int parent = sources.poll();
            order.add(parent);
            for (int child : DAG.get(parent)) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    sources.offer(child);
                }
            }
        }

        return order.size() == originalSeq.length;
    }
}
