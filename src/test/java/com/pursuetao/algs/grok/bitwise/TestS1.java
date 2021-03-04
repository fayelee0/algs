package com.pursuetao.algs.grok.bitwise;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
    @Test
    public void findMissingNumber() {
        assertThat(S1.findMissingNumber(new int[]{1, 5, 2, 6, 4}), is(3));
    }

    @Test
    public void findMissingNumber2() {
        assertThat(S1.findMissingNumber2(new int[]{1, 5, 2, 6, 4}), is(3));
    }
}
