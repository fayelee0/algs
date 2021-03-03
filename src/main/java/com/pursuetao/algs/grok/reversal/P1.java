package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;

// Reverse alternating K-element Sub-list
//
// Given the head of a LinkedList and a number ‘k’, reverse every alternating ‘k’ sized sub-list starting from the head.
// If, in the end, you are left with a sub-list with less than ‘k’ elements, reverse it too.
public class P1 {
    public static ListNode reverse(ListNode head, int K) {
        if (K <= 1 || head == null) {
            return head;
        }

        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode lastNodeOfPreviousPart = previous;
            ListNode lastNodeOfSublist = current;

            ListNode next;
            for (int i = 0; i < K && current != null; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            if (lastNodeOfPreviousPart == null) {
                head = previous;
            } else {
                lastNodeOfPreviousPart.next = previous;
            }

            lastNodeOfSublist.next = current;

            for (int i = 0; i < K && current != null; i++) {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }
}
