package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;

// Reverse a Sub-list
//
// Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’.
public class S2 {
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static ListNode reverse(ListNode head, int p, int q) {
        if (p == q) {
            return head;
        }

        ListNode prev = null; // Node(p-1)
        ListNode curr = head; // Node(p)
        for (int i = 0; curr != null && i < p - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode lastNodeOfFirstPart = prev;
        ListNode lastNodeOfSubset = curr;

        ListNode next;
        for (int i = 0; curr != null && i < q - p + 1; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (lastNodeOfFirstPart != null) {
            lastNodeOfFirstPart.next = prev;
        } else {
            head = prev;    // if p == 1 !!!
        }

        lastNodeOfSubset.next = curr;

        return head;
    }
}
