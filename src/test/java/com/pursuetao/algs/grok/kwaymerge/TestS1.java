package com.pursuetao.algs.grok.kwaymerge;

import com.pursuetao.algs.grok.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestS1 {
    private ListNode[] lists1;
    private ListNode[] lists2;

    @BeforeEach
    public void setup() {
        lists1 = new ListNode[]{
                new ListNode(2, new ListNode(6, new ListNode(8))),
                new ListNode(3, new ListNode(6, new ListNode(7))),
                new ListNode(1, new ListNode(3, new ListNode(4)))};

        lists2 = new ListNode[]{
                new ListNode(5, new ListNode(8, new ListNode(9))),
                new ListNode(1, new ListNode(7))};
    }

    @Test
    public void merge() {
        assertThat(S1.merge(lists1).iter(), is(contains(1, 2, 3, 3, 4, 6, 6, 7, 8)));
        assertThat(S1.merge(lists2).iter(), is(contains(1, 5, 7, 8, 9)));
    }
}
