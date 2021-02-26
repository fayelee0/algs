package com.pursuetao.algs.grok.fastslow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS2 {
    private ListNode node;

    @BeforeEach
    public void setup() {
        node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    }

    @Test
    public void findCycleStart() {
        node.next.next.next.next.next = node.next.next;
        assertThat(S2.findCycleStart(node).value, is(3));

        node.next.next.next.next.next = node.next.next.next;
        assertThat(S2.findCycleStart(node).value, is(4));

        node.next.next.next.next.next = node;
        assertThat(S2.findCycleStart(node).value, is(1));
    }
}
