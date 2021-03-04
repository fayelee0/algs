package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;

// Sum of Path Numbers
//
// Given a binary tree where each node can only have a digit (0-9) value, each root-to-leaf path will represent a number. Find the total sum of all the numbers represented by all paths.
public class S3 {
    public static int findSumOfPathNumbers(TreeNode root) {
        return traverse(root, 0);
    }

    private static int traverse(TreeNode node, int V) {
        if (node == null) {
            return 0;
        }

        V = 10 * V + node.val;
        if (isLeaf(node)) {
            return V;
        }

        return traverse(node.left, V) + traverse(node.right, V);
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
