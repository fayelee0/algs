package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS5 {
    private TreeNode node0;
    private TreeNode node1;
    private TreeNode node2;

    @BeforeEach
    public void setup() {
        node0 = new TreeNode(2,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));

        node1 = new TreeNode(12,
                new TreeNode(7),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));

        node2 = new TreeNode(12,
                new TreeNode(7,
                        new TreeNode(9),
                        null),
                new TreeNode(1,
                        new TreeNode(10,
                                new TreeNode(11),
                                null),
                        new TreeNode(5)));
    }

    @Test
    public void findDepth() {
        assertThat(S5.findDepth(node0), is(2));
        assertThat(S5.findDepth(node1), is(2));
        assertThat(S5.findDepth(node2), is(3));
    }
}
