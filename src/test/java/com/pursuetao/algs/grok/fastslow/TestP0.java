package com.pursuetao.algs.grok.fastslow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestP0 {
    private ListNode node0;
    private ListNode node1;

    @BeforeEach
    public void setup() {
        node0 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(4, new ListNode(2)))));
        node1 = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(4, new ListNode(2, new ListNode(2))))));
    }

    @Test
    public void isPalindrome() {
        assertThat(P0.isPalindrome(node0), is(true));
        assertThat(P0.isPalindrome(node1), is(false));
    }
}
