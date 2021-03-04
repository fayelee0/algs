package com.pursuetao.algs.grok.bitwise;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS2 {
    @Test
    public void findMissingNumber() {
        assertThat(S2.findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}), is(4));
        assertThat(S2.findSingleNumber(new int[]{7, 9, 7}), is(9));
    }
}
