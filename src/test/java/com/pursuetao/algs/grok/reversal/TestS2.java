package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS2 {
    private ListNode node;

    @BeforeEach
    public void setup() {
        node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    }

    @Test
    public void reverse() {
        assertThat(node.iter(), is(contains(1, 2, 3, 4, 5)));
        assertThat(S2.reverse(node, 2, 4).iter(), is(contains(1, 4, 3, 2, 5)));
    }
}
