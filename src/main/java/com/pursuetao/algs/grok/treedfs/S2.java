package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.ArrayList;
import java.util.List;

// All Paths for a Sum
//
// Given a binary tree and a number ‘S’, find all paths from root-to-leaf such that the sum of all the node values of each path equals ‘S’.
public class S2 {
    public static List<List<Integer>> findPaths(TreeNode root, int S) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, S, new ArrayList<>(), result);
        return result;
    }

    private static void traverse(TreeNode node, int S, List<Integer> path, List<List<Integer>> paths) {
        if (node != null) {
            path.add(node.val);
            if (isLeaf(node) && node.val == S) {
                paths.add(new ArrayList<>(path));
            } else {
                traverse(node.left, S - node.val, path, paths);
                traverse(node.right, S - node.val, path, paths);
            }
            path.remove(path.size() - 1);
        }
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
