package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS3 {
    private ListNode node;
    private ListNode node2;

    @BeforeEach
    public void setup() {
        node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));
        node2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    }

    @Test
    public void reverse() {
        assertThat(node.iter(), is(contains(1, 2, 3, 4, 5, 6, 7, 8)));
        assertThat(S3.reverse(node, 3).iter(), is(contains(3, 2, 1, 6, 5, 4, 8, 7)));

        assertThat(node2.iter(), is(contains(1, 2, 3, 4, 5, 6)));
        assertThat(S3.reverse(node2, 3).iter(), is(contains(3, 2, 1, 6, 5, 4)));
    }
}
