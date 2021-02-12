package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS5 {
    @Test
    public void findLength() {
        assertThat(S5.findLength("aabccbb"), is(3));
        assertThat(S5.findLength("abbbb"), is(2));
        assertThat(S5.findLength("abccde"), is(3));
    }

    @Test
    public void findLengthX() {
        assertThat(S5.findLengthX("aabccbb"), is(3));
        assertThat(S5.findLengthX("abbbb"), is(2));
        assertThat(S5.findLengthX("abccde"), is(3));
    }
}
