package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS4 {
    @Test
    public void findLength() {
        assertThat(S4.findLength(new char[]{'A', 'B', 'C', 'A', 'C'}), is(3));
        assertThat(S4.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}), is(5));
    }
}
