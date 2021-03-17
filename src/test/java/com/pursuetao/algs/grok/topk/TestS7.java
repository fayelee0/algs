package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS7 {
    private S7 o;

    @BeforeEach
    public void setup() {
        o = new S7(new int[]{3, 1, 5, 12, 2, 11}, 4);
    }

    @Test
    public void add() {
        assertThat(o.add(6), is(5));
        assertThat(o.add(13), is(6));
        assertThat(o.add(4), is(6));
    }
}
