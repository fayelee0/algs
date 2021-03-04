package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestS4 {
    private TreeNode root0;
    private TreeNode root1;

    @BeforeEach
    public void setup() {
        root0 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7)));

        root1 = new TreeNode(12,
                new TreeNode(7,
                        new TreeNode(9),
                        new TreeNode(2)),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));
    }

    @Test
    public void findLevelAverages() {
        assertThat(S4.findLevelAverages(root0), is(contains(1.0, 2.5, 5.5)));
        assertThat(S4.findLevelAverages(root1), is(contains(12.0, 4.0, 6.5)));
    }
}
