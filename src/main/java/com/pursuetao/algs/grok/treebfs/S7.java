package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// Connect Level Order Siblings
//
// Given a binary tree, connect each node with its level order successor. The last node of each level should point to a null node.
public class S7 {
    public static void connect(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode prev = null;
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode node = queue.poll();
                    if (prev != null) {
                        prev.next = node;
                    }
                    prev = node;

                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
        }
    }
}
