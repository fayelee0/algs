package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// Connect All Level Order Siblings
//
// Given a binary tree, connect each node with its level order successor.
// The last node of each level should point to the first node of the next level.
public class P1 {
    public static void connect(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            TreeNode prev = null;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (prev != null) {
                    prev.next = node;
                }
                prev = node;
            }
        }
    }
}
