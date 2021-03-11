package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
    @Test
    public void findKLargestNumbers() {
        assertThat(S1.findKLargestNumbers(new int[]{3, 1, 5, 12, 2, 11}, 3), is(containsInAnyOrder(5, 12, 11)));
        assertThat(S1.findKLargestNumbers(new int[]{5, 12, 11, -1, 12}, 3), is(containsInAnyOrder(12, 11, 12)));
    }
}
