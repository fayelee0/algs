package com.pursuetao.algs.grok.treebfs;

import com.pursuetao.algs.grok.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS7 {
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
        S7.connect(tree0);
        assertThat(nextTraverse(tree0), is(contains(Collections.singletonList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6, 7))));

        S7.connect(tree1);
        assertThat(nextTraverse(tree1), is(contains(Collections.singletonList(12), Arrays.asList(7, 1), Arrays.asList(9, 10, 5))));
    }

    private static List<List<Integer>> nextTraverse(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> ret = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (i == 0) {
                    for (TreeNode x = node; x != null; x = x.next) {
                        ret.add(x.val);
                    }
                }
            }
            result.add(ret);
        }
        return result;
    }
}
