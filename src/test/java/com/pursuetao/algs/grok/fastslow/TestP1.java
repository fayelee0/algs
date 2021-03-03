package com.pursuetao.algs.grok.fastslow;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestP1 {
    private ListNode node0;
    private ListNode node1;

    @BeforeEach
    public void setup() {
        node0 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10, new ListNode(12))))));
        node1 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8, new ListNode(10)))));
    }
    @Test
    public void reorder() {
        assertThat(node0.iter(), is(contains(2, 4, 6, 8, 10, 12)));
        P1.reorder(node0);
        assertThat(node0.iter(), is(contains(2, 12, 4, 10, 6, 8)));

        assertThat(node1.iter(), is(contains(2, 4, 6, 8, 10)));
        P1.reorder(node1);
        assertThat(node1.iter(), is(contains(2, 10, 4, 8, 6)));
    }
}
