package com.pursuetao.algs.grok.kwaymerge;

import com.pursuetao.algs.grok.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

// Merge K Sorted Lists
//
// Given an array of ‘K’ sorted LinkedLists, merge them into one sorted list.
public class S1 {
    public static ListNode merge(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.value - o2.value;
            }
        });

        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode next = null;
        while (!minHeap.isEmpty()) {
            next = minHeap.poll();
            tail.next = next;
            tail = next;
            if (next.next != null) {
                minHeap.offer(next.next);
            }
        }
        next.next = null;
        return head.next;
    }
}
