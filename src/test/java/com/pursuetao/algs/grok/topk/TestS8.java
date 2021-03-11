package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS8 {
    @Test
    public void findClosestElements() {
        assertThat(S8.findClosestElements(new int[]{5, 6, 7, 8, 9}, 3, 7), is(contains(6, 7, 8)));
        assertThat(S8.findClosestElements(new int[]{2, 4, 5, 6, 9}, 3, 6), is(contains(4, 5, 6)));
        assertThat(S8.findClosestElements(new int[]{2, 4, 5, 6, 9}, 3, 10), is(contains(5, 6, 9)));
    }
}
