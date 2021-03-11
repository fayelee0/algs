package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS2 {
    @Test
    public void findKthSmallestNumber() {
        assertThat(S2.findKthSmallestNumber(new int[]{1, 5, 12, 2, 11, 5}, 3), is(5));
        assertThat(S2.findKthSmallestNumber(new int[]{1, 5, 12, 2, 11, 5}, 4), is(5));
        assertThat(S2.findKthSmallestNumber(new int[]{5, 12, 11, -1, 12}, 3), is(11));
    }
}
