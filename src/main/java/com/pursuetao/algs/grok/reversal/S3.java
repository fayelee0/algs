package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;

// Reverse every K-element Sub-list
//
// Given the head of a LinkedList and a number ‘k’, reverse every ‘k’ sized sub-list starting from the head.
// If, in the end, you are left with a sub-list with less than ‘k’ elements, reverse it too.
public class S3 {
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static ListNode reverse(ListNode head, int K) {
        if (K <= 1 || head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (true) {
            ListNode lastNodeOfPreviousPart = prev;
            ListNode lastNodeOfSubList = curr;

            ListNode next;
            for (int i = 0; i < K && curr != null; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if (lastNodeOfPreviousPart != null) {
                lastNodeOfPreviousPart.next = prev;
            } else {
                head = prev;
            }

            lastNodeOfSubList.next = curr;

            if (curr == null) {
                break;
            }

            prev = lastNodeOfSubList;
        }

        return head;
    }
}
