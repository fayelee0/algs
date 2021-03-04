package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestS2 {
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
                        null),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));
    }

    @Test
    public void traverse() {
        assertThat(S2.traverse(root0), is(contains(Arrays.asList(4, 5, 6, 7), Arrays.asList(2, 3), Collections.singletonList(1))));
        assertThat(S2.traverse(root1), is(contains(Arrays.asList(9, 10, 5),Arrays.asList(7, 1),  Collections.singletonList(12))));
    }
}
