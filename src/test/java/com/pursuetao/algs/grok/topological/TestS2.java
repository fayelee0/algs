package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS2 {
    @Test
    public void isSchedulingPossible() {
        assertThat(S2.isSchedulingPossible(3, new int[][]{{0, 1}, {1, 2}}), is(true));
        assertThat(S2.isSchedulingPossible(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}), is(false));
        assertThat(S2.isSchedulingPossible(6, new int[][]{{2, 5}, {0, 5}, {0, 4}, {1, 4}, {3, 2}, {1, 3}}), is(true));
    }
}
