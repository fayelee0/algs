package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
    @Test
    public void findMaxSumSubArray() {
        assertThat(S1.findMaxSumSubArray(2, new int[]{2, 3, 4, 1, 5}), is(7));
    }
}
