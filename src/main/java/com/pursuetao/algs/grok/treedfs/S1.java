package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;

// Binary Tree Path Sum
//
// Given a binary tree and a number ‘S’, find if the tree has a path from root-to-leaf such that the sum of all the node values of that path equals ‘S’.
public class S1 {
    // Time Complexity O(N), N is the total number of nodes in the tree.
    // Space Complexity O(N), the worst case when the tree is a linked list.
    public static boolean hasPath(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
    }
}
