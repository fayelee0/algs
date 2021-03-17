package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS4 {
    @Test
    public void orders() {
        assertThat(S4.orders(3, new int[][]{{0, 1}, {1, 2}}), is(containsInAnyOrder(Arrays.asList(0, 1, 2))));
        assertThat(S4.orders(4, new int[][]{{3, 2}, {3, 0}, {2, 0}, {2, 1}}), is(containsInAnyOrder(Arrays.asList(3, 2, 0, 1), Arrays.asList(3, 2, 1, 0))));
        assertThat(S4.orders(6, new int[][]{{2, 5}, {0, 5}, {0, 4}, {1, 4}, {3, 2}, {1, 3}}), is(containsInAnyOrder(
                Arrays.asList(0, 1, 4, 3, 2, 5),
                Arrays.asList(0, 1, 3, 4, 2, 5),
                Arrays.asList(0, 1, 3, 2, 4, 5),
                Arrays.asList(0, 1, 3, 2, 5, 4),
                Arrays.asList(1, 0, 3, 4, 2, 5),
                Arrays.asList(1, 0, 3, 2, 4, 5),
                Arrays.asList(1, 0, 3, 2, 5, 4),
                Arrays.asList(1, 0, 4, 3, 2, 5),
                Arrays.asList(1, 3, 0, 2, 4, 5),
                Arrays.asList(1, 3, 0, 2, 5, 4),
                Arrays.asList(1, 3, 0, 4, 2, 5),
                Arrays.asList(1, 3, 2, 0, 5, 4),
                Arrays.asList(1, 3, 2, 0, 4, 5))));
    }
}
