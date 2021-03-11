package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS5 {
    @Test
    public void findTopKFrequentNumbers() {
        assertThat(S5.findTopKFrequentNumbers(new int[]{1, 3, 5, 12, 11, 12, 11}, 2), is(containsInAnyOrder(12, 11)));
        assertThat(S5.findTopKFrequentNumbers(new int[]{5, 12, 11, 3, 11}, 2), is(containsInAnyOrder(11, 12)));
    }
}
