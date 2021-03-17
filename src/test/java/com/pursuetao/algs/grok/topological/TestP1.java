package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestP1 {
    @Test
    public void canConstruct() {
        assertThat(P1.canConstruct(new int[]{1, 2, 3, 4}, new int[][]{{1, 2}, {2, 3}, {3, 4}}), is(true));
        assertThat(P1.canConstruct(new int[]{1, 2, 3, 4}, new int[][]{{1, 2}, {2, 3}, {2, 4}}), is(false));
        assertThat(P1.canConstruct(new int[]{3, 1, 4, 2, 5}, new int[][]{{3, 1, 5}, {1, 4, 2, 5}}), is(true));
    }
}
