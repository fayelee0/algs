package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS6 {
    @Test
    public void findLength() {
        assertThat(S6.findLength("aabccbb", 2), is(5));
        assertThat(S6.findLength("abbcb", 1), is(4));
        assertThat(S6.findLength("abccde", 1), is(3));
    }
}
