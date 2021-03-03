package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP2 {
    private ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    private ListNode node2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

    @BeforeEach
    public void setup() {
        node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        node2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    }

    @Test
    public void rotate() {
        assertThat(P2.rotate(node1, 3).iter(), is(contains(4, 5, 6, 1, 2, 3)));
        assertThat(P2.rotate(node2, 8).iter(), is(contains(3, 4, 5, 1, 2)));
    }
}
