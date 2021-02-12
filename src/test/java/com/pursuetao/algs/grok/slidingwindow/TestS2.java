package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS2 {
    @Test
    public void findMinSubArray() {
        assertThat(S2.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}), is(2));
        assertThat(S2.findMinSubArray(7, new int[]{2, 1, 5, 2, 8}), is(1));
        assertThat(S2.findMinSubArray(8, new int[]{3, 4, 1, 1, 6}), is(3));
    }
}
