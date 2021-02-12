package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS0 {
    @Test
    public void findAverages() {
        assertThat(S0.findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}), is(new double[]{2.2, 2.8, 2.4, 3.6, 2.8}));
    }
}
