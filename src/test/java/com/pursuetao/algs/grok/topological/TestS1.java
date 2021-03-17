package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
    @Test
    public void sort() {
        assertThat(S1.sort(4, new int[][]{{3, 2}, {3, 0}, {2, 0}, {2, 1}}), is(contains(3, 2, 0, 1)));
        assertThat(S1.sort(5, new int[][]{{4, 2}, {4, 3}, {2, 0}, {2, 1}, {3, 1}}), is(contains(4, 2, 3, 0, 1)));
    }
}
