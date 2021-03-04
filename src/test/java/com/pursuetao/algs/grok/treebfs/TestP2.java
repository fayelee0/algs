package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP2 {
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
                        new TreeNode(9,
                                new TreeNode(3),
                                null),
                        null),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));
    }

    @Test
    public void traverse() {
        assertThat(transfer(P2.traverse(tree0)), is(contains(1, 3, 7)));
        assertThat(transfer(P2.traverse(tree1)), is(contains(12, 1, 5, 3)));
    }

    private static List<Integer> transfer(List<TreeNode> list) {
        List<Integer> result = new ArrayList<>();
        for (TreeNode node : list) {
            result.add(node.val);
        }
        return result;
    }
}
