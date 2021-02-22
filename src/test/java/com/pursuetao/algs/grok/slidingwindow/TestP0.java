package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP0 {
    @Test
    public void findPermutation() {
        assertThat(P0.findPermutation("oidbcaf", "abc"), is(true));
        assertThat(P0.findPermutation("odicf", "dc"), is(false));
        assertThat(P0.findPermutation("bcdxabcdy", "bcdyabcdx"), is(true));
        assertThat(P0.findPermutation("aaacb", "abc"), is(true));
    }

    @Test
    public void findPermutationX() {
        assertThat(P0.findPermutationX("oidbcaf", "abc"), is(true));
        assertThat(P0.findPermutationX("odicf", "dc"), is(false));
        assertThat(P0.findPermutationX("bcdxabcdy", "bcdyabcdx"), is(true));
        assertThat(P0.findPermutationX("aaacb", "abc"), is(true));
    }
}
