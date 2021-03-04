package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.*;

// Right View of a Binary Tree
//
// Given a binary tree, return an array containing nodes in its right view.
// The right view of a binary tree is the set of nodes visible when the tree is seen from the right side.
public class P2 {
    public static List<TreeNode> traverse(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<TreeNode> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (i + 1 == size) {
                    result.add(node);
                }
            }
        }

        return result;
    }
}
