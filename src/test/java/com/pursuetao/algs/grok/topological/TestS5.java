package com.pursuetao.algs.grok.topological;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS5 {
    @Test
    public void findOrder() {
        assertThat(S5.findOrder(new String[]{"ba", "bc", "ac", "cab"}), is("bac"));
        assertThat(S5.findOrder(new String[]{"cab", "aaa", "aab"}), is("cab"));
        assertThat(S5.findOrder(new String[]{"ywx", "wz", "xww", "xz", "zyy", "zwz"}), is("ywxz"));
    }
}
