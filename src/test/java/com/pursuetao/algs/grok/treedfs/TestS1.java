package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
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
    public void hasPath() {
        assertThat(S1.hasPath(tree0, 10), is(true));
        assertThat(S1.hasPath(tree1, 23), is(true));
        assertThat(S1.hasPath(tree1, 16), is(false));
    }
}
