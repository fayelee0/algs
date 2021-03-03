package com.pursuetao.algs.grok.fastslow;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS4 {
    private ListNode node0;
    private ListNode node1;
    private ListNode node2;

    @BeforeEach
    public void setup() {
        node0 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        node2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
    }

    @Test
    public void findMiddle() {
        assertThat(S4.findMiddle(node0).value, is(3));
        assertThat(S4.findMiddle(node1).value, is(4));
        assertThat(S4.findMiddle(node2).value, is(4));
    }
}
