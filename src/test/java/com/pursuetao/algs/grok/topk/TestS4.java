package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS4 {
    @Test
    public void minimumCostToConnectRopes() {
        assertThat(S4.minimumCostToConnectRopes(new int[]{1, 3, 11, 5}), is(33));
        assertThat(S4.minimumCostToConnectRopes(new int[]{3, 4, 5, 6}), is(36));
        assertThat(S4.minimumCostToConnectRopes(new int[]{1, 3, 11, 5, 2}), is(42));
    }
}
