package com.pursuetao.algs.grok.kwaymerge;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP1 {
    @Test
    public void findKLargestPairs() {
        assertThat(P1.findKLargestPairs(new int[]{9, 8, 2}, new int[]{6, 3, 1}, 3), is(containsInAnyOrder(new int[]{9, 3}, new int[]{9, 6}, new int[]{8, 6})));
        assertThat(P1.findKLargestPairs(new int[]{5, 2, 1}, new int[]{2, -1}, 3), is(containsInAnyOrder(new int[]{5, 2}, new int[]{5, -1}, new int[]{2, 2})));
    }
}
