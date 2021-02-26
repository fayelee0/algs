package com.pursuetao.algs.grok.fastslow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestS0 {
    private ListNode cycleList;
    private ListNode noCycleList;

    @BeforeEach
    public void setup() {
        noCycleList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode node = new ListNode(6);
        cycleList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, node)))));
        node.next = cycleList;
    }

    @Test
    public void hasCycle() {
        assertThat(S0.hasCycle(noCycleList), is(false));
        assertThat(S0.hasCycle(cycleList), is(true));
    }
}
