package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS2 {
    private TreeNode tree0;
    private TreeNode tree1;

    @BeforeEach
    public void setup() {
        tree0 = new TreeNode(1,
                new TreeNode(7,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(9,
                        new TreeNode(2),
                        new TreeNode(7)));

        tree1 = new TreeNode(12,
                new TreeNode(7,
                        new TreeNode(4),
                        null),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));
    }
    @Test
    public void findPaths() {
        assertThat(S2.findPaths(tree0, 12), is(contains(Arrays.asList(1, 7, 4), Arrays.asList(1, 9, 2))));
        assertThat(S2.findPaths(tree1, 23), is(contains(Arrays.asList(12, 7, 4), Arrays.asList(12, 1, 10))));
    }
}
