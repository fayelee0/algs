package com.pursuetao.algs.grok.topological;

import java.util.*;

// Alien Dictionary
public class S5 {
    public static String findOrder(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, List<Character>> DAG = new HashMap<>();
        for (String word : words) {
            for (char character : word.toCharArray()) {
                inDegree.put(character, 0);
                DAG.put(character, new ArrayList<>());
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String prev = words[i];
            String next = words[i + 1];
            for (int j = 0; j < Math.min(prev.length(), next.length()); j++) {
                char parent = prev.charAt(j);
                char child = next.charAt(j);
                if (parent != child) {
                    inDegree.put(child, inDegree.getOrDefault(child, 0) + 1);
                    DAG.get(parent).add(child);
                    break;
                }
            }
        }

        Queue<Character> sources = new LinkedList<>();
        for (Map.Entry<Character, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                sources.offer(entry.getKey());
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!sources.isEmpty()) {
            char vertex = sources.poll();
            sb.append(vertex);
            for (Character child : DAG.get(vertex)) {
                inDegree.put(child, inDegree.get(child) - 1);
                if (inDegree.get(child) == 0) {
                    sources.offer(child);
                }
            }
        }

        if (sb.length() != inDegree.size()) {
            return "";
        }

        return sb.toString();
    }
}
