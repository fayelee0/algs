package com.pursuetao.algs.grok.fastslow;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int value;
    public ListNode next = null;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public List<Integer> iter() {
        List<Integer> ret = new ArrayList<>();
        for (ListNode node = this; node != null; node = node.next) {
            ret.add(node.value);
        }
        return ret;
    }
}
