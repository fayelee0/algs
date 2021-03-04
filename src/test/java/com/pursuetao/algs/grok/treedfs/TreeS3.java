package com.pursuetao.algs.grok.treedfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TreeS3 {
    private TreeNode tree0;
    private TreeNode tree1;

    @BeforeEach
    public void setup() {
        tree0 = new TreeNode(1,
                new TreeNode(7),
                new TreeNode(9,
                        new TreeNode(2),
                        new TreeNode(9)));

        tree1 = new TreeNode(1,
                new TreeNode(0,
                        new TreeNode(1),
                        null),
                new TreeNode(1,
                        new TreeNode(6),
                        new TreeNode(5)));
    }

    @Test
    public void findSumOfPathNumbers() {
        assertThat(S3.findSumOfPathNumbers(tree0), is(408));
        assertThat(S3.findSumOfPathNumbers(tree1), is(332));
    }
}
