package com.pursuetao.algs.grok.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS3 {
    @Test
    public void findLength() {
        assertThat(S3.findLength("araaci", 2), is(4));
        assertThat(S3.findLength("araaci", 1), is(2));
        assertThat(S3.findLength("cbbebi", 3), is(5));
    }
}
