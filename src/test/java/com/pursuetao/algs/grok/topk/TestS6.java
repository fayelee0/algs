package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS6 {
    @Test
    public void sortCharacterByFrequency() {
        assertThat(S6.sortCharacterByFrequency("Programming"), is("rrggmmPiano"));
        assertThat(S6.sortCharacterByFrequency("abcbab"), is("bbbaac"));
    }
}
