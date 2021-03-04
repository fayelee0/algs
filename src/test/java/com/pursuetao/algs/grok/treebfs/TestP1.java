package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestP1 {
    private TreeNode tree0;
    private TreeNode tree1;

    @BeforeEach
    public void setup() {
        tree0 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7)));

        tree1 = new TreeNode(12,
                new TreeNode(7,
                        new TreeNode(9),
                        null),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));
    }

    @Test
    public void connect() {
        P1.connect(tree0);
        assertThat(nextTraverse(tree0), is(contains(1, 2, 3, 4, 5, 6, 7)));

        P1.connect(tree1);
        assertThat(nextTraverse(tree1), is(contains(12, 7, 1, 9, 10, 5)));
    }

    private static List<Integer> nextTraverse(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        for (TreeNode x = root; x != null; x = x.next) {
            result.add(x.val);
        }
        return result;
    }
}
