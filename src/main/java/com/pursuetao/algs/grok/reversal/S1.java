package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;

// Reverse a LinkedList
//
// Given the head of a Singly LinkedList, reverse the LinkedList.
// Write a function to return the new head of the reversed LinkedList.
public class S1 {
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
