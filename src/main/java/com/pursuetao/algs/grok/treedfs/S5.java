package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Count Paths for a Sum
//
// Given a binary tree and a number ‘S’, find all paths in the tree such that the sum of all the node values of each path equals ‘S’. Please note that the paths can start or end at any node but all paths must follow direction from parent to child (top to bottom).
public class S5 {
    public static int countPaths(TreeNode root, int S) {
        List<Integer> path = new ArrayList<>();
        return traverse(root, S, path);
    }

    private static int traverse(TreeNode node, int S, List<Integer> path) {
        if (node == null) {
            return 0;
        }

        path.add(node.val);

        int pathCount = 0;
        int pathSum = 0;
        ListIterator<Integer> iterator = path.listIterator(path.size());
        while (iterator.hasPrevious()) {
            pathSum += iterator.previous();
            if (pathSum == S) {
                pathCount++;
            }
        }

        pathCount += traverse(node.left, S, path);
        pathCount += traverse(node.right, S, path);

        path.remove(path.size() - 1);
        return pathCount;
    }
}
