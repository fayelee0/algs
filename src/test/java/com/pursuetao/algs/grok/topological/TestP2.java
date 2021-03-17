package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class TestP2 {
    @Test
    public void findTrees() {
        assertThat(P2.findTrees(5, new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 4}}), is(containsInAnyOrder(1, 2)));
        assertThat(P2.findTrees(4, new int[][]{{0, 1}, {0, 2}, {2, 3}}), is(containsInAnyOrder(0, 2)));
    }
}
