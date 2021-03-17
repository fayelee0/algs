package com.pursuetao.algs.grok.topk;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS3 {
    @Test
    public void findClosestPoints() {
        Point p0 = new Point(1, 2);
        Point p1 = new Point(1, 3);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, -1);

        assertThat(S3.findClosestPoints(new Point[]{p0, p1}, 1), is(contains(p0)));
        assertThat(S3.findClosestPoints(new Point[]{p1, p2, p3}, 2), is(contains(p1, p3)));
    }
}
