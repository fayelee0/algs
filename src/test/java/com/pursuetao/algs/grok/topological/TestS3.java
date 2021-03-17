package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestS3 {
    @Test
    public void findOrder() {
        assertThat(S3.findOrder(3, new int[][]{{0, 1}, {1, 2}}), is(contains(0, 1, 2)));
        assertThat(S3.findOrder(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}).size(), is(0));
        assertThat(S3.findOrder(6, new int[][]{{2, 5}, {0, 5}, {0, 4}, {1, 4}, {3, 2}, {1, 3}}), is(contains(0, 1, 4, 3, 2, 5)));
    }
}
