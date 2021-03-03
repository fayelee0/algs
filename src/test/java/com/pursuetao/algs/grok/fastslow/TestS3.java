package com.pursuetao.algs.grok.fastslow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS3 {
    @Test
    public void find() {
        assertThat(S3.find(23), is(true));
        assertThat(S3.find(12), is(false));
    }
}
