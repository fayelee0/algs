package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS6 {
    private TreeNode node0;
    private TreeNode node1;

    @BeforeEach
    public void setup() {
        node0 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));

        node1 = new TreeNode(12,
                new TreeNode(7,
                        new TreeNode(9),
                        null),
                new TreeNode(1,
                        new TreeNode(10),
                        new TreeNode(5)));
    }

    @Test
    public void findSuccessor() {
        assertThat(S6.findSuccessor(node0, 3).val, is(4));
        assertThat(S6.findSuccessor(node1, 9).val, is(10));
        assertThat(S6.findSuccessor(node1, 12).val, is(7));
    }
}
