package com.pursuetao.algs.grok.kwaymerge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS4 {
    @Test
    public void minIntegerSubOne() {
        assertThat(Integer.MIN_VALUE - 1, is(Integer.MAX_VALUE));
    }

    @Test
    public void findSmallestRange() {
        assertThat(
                S4.findSmallestRange(
                        Arrays.asList(
                                new Integer[]{2, 5, 8},
                                new Integer[]{4, 12},
                                new Integer[]{7, 8, 10}
                        )
                ),
                is(new int[]{4, 7})
        );

        assertThat(
                S4.findSmallestRange(
                        Arrays.asList(
                                new Integer[]{1, 9},
                                new Integer[]{4, 12},
                                new Integer[]{7, 10, 16}
                        )
                ),
                is(new int[]{9, 12})
        );
    }
}
