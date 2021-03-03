package com.pursuetao.algs.grok.slidingwindow;

import java.util.*;

// Words Concatenation
// Given a string and a list of words, find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once without any overlapping of words. It is given that all words are of the same length.
public class P3 {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        Map<String, Integer> mem = new HashMap<>();
        for (String word : words) {
            mem.put(word, mem.getOrDefault(word, 0) + 1);
        }

        List<Integer> ret = new ArrayList<>();

        int wordsCount = words.length;
        int wordLength = words[0].length();
        for (int i = 0; i <= str.length() - wordsCount * wordLength; i++) {
            Map<String, Integer> wordsSeen = new HashMap<>();
            for (int j = 0; j < wordsCount; j++) {
                int next = i + j * wordLength;
                String word = str.substring(next, next + wordLength);
                if (!mem.containsKey(word)) {
                    break;
                }

                wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);
                if (wordsSeen.get(word) > mem.get(word)) {
                    break;
                }

                if (j + 1 == wordsCount) {
                    ret.add(i);
                }
            }
        }

        return ret;
    }
}
