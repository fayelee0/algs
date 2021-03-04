package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// Minimum Depth of a Binary Tree
//
// Find the minimum depth of a binary tree.
// The minimum depth is the number of nodes along the shortest path from the root node to the nearest leaf node.
public class S5 {
    public static int findDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            depth++;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return depth;
    }
}
