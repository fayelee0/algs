package com.pursuetao.algs.grok.kwaymerge;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS3 {
    @Test
    public void findKthSmallest() {
        int[][] matrix = {{2, 6, 8}, {3, 7, 10}, {5, 8, 11}};
        assertThat(S3.findKthSmallest(matrix, 5), is(7));
    }
}
