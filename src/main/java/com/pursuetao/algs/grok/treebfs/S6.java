package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// Level Order Successor
//
// Given a binary tree and a node, find the level order successor of the given node in the tree.
// The level order successor is the node that appears right after the given node in the level order traversal.
public class S6 {
    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (node.val == key) {
                break;
            }
        }
        return queue.peek();
    }
}
