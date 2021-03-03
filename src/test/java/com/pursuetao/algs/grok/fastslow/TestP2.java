package com.pursuetao.algs.grok.fastslow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP2 {
    @Test
    public void loopExists() {
        assertThat(P2.loopExists(new int[]{1, 2, -1, 2, 2}), is(true));
        assertThat(P2.loopExists(new int[]{2, 2, -1, 2}), is(true));
        assertThat(P2.loopExists(new int[]{2, 1, -1, 2}), is(false));
    }
}
