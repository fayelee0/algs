package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP3 {
    @Test
    public void findWordConcatenation() {
        assertThat(P3.findWordConcatenation("catfoxcat", new String[]{"cat", "fox"}), is(contains(0, 3)));
        assertThat(P3.findWordConcatenation("catcatfoxfox", new String[]{"cat", "fox"}), is(contains(3)));
    }
}
