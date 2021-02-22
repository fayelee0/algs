package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP1 {
    @Test
    public void findStringAnagrams() {
        assertThat(P1.findStringAnagrams("ppqp", "pq"), is(contains(1, 2)));
        assertThat(P1.findStringAnagrams("abbcabc", "abc"), is(contains(2, 3, 4)));
    }
}
