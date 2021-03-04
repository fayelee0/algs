package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.*;

// Level Averages in a Binary Tree
//
// Given a binary tree, populate an array to represent the averages of all of its levels.
public class S4 {
    public static List<Double> findLevelAverages(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                sum += node.val;
            }
            result.add(sum * 1.0/ levelSize);
        }

        return result;
    }
}
