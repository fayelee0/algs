package com.pursuetao.algs.grok.kwaymerge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS2 {
    @Test
    public void findKthSmallest() {
        assertThat(S2.findKthSmallest(Arrays.asList(new Integer[]{2, 6, 8}, new Integer[]{3, 6, 7}, new Integer[]{1, 3, 4}), 5), is(4));
        assertThat(S2.findKthSmallest(Arrays.asList(new Integer[]{5, 8, 9}, new Integer[]{1, 7}), 3), is(7));
    }
}
