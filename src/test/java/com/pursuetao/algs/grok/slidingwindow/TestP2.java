package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP2 {
    @Test
    public void findSubstring() {
        assertThat(P2.findSubString("adcad", "abc"), is(""));
        assertThat(P2.findSubString("adcad", "abc"), is(""));
        assertThat(P2.findSubString("aabdec", "abc"), is("abdec"));
        assertThat(P2.findSubString("abdbca", "abc"), is("bca"));
        assertThat(P2.findSubString("abdbca", "abc"), is("bca"));

    }
}
