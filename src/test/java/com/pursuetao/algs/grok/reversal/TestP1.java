package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestP1 {
    private ListNode node;
    private ListNode node2;

    @BeforeEach
    public void setup() {
        node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
        node2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    }

    @Test
    public void reverse() {
        assertThat(node.iter(), is(contains(1, 2, 3, 4, 5, 6, 7)));
        assertThat(P1.reverse(node, 2).iter(), is(contains(2, 1, 3, 4, 6, 5, 7)));

        assertThat(node2.iter(), is(contains(1, 2, 3, 4, 5, 6)));
        assertThat(P1.reverse(node2, 2).iter(), is(contains(2, 1, 3, 4, 6, 5)));
    }
}
