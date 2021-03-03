package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
    private ListNode head;

    @BeforeEach
    public void setup() {
        head = new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8))));
    }
    @Test
    public void reverse() {
        assertThat(head.iter(), is(contains(2, 4, 6, 8)));
        assertThat(S1.reverse(head).iter(), is(contains(8, 6, 4, 2)));
    }
}
