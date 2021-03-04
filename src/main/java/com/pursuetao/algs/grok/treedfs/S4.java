package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;

// Path With Given Sequence
//
// Given a binary tree and a number sequence, find if the sequence is present as a root-to-leaf path in the given tree.
public class S4 {
    public static boolean findPath(TreeNode root, int[] sequence) {
        if (root == null) {
            return sequence.length == 0;
        }

        return findPathX(root, sequence, 0);
    }

    private static boolean findPathX(TreeNode node, int[] sequence, int index) {
        if (node == null) {
            return false;
        }

        if (index >= sequence.length || node.val != sequence[index]) {
            return false;
        }

        if (isLeaf(node) && isLast(sequence, index)) {
            return true;
        }

        return findPathX(node.left, sequence, index + 1) || findPathX(node.right, sequence, index + 1);
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private static boolean isLast(int[] sequence, int index) {
        return index + 1 == sequence.length;
    }
}
