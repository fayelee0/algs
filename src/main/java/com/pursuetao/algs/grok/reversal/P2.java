package com.pursuetao.algs.grok.reversal;

import com.pursuetao.algs.grok.ListNode;

// Rotate a LinkedList
//
// Given the head of a Singly LinkedList and a number ‘k’, rotate the LinkedList to the right by ‘k’ nodes.
public class P2 {
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static ListNode rotate(ListNode head, int rotations) {
        if (head == null || head.next == null || rotations <= 0) {
            return head;
        }

        ListNode last = head;
        int N = 1;
        for (; last.next != null; last = last.next) {
            N++;
        }

        rotations = rotations % N;
        if (rotations == 0) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < N - rotations; i++) {
            prev = curr;
            curr = curr.next;
        }

        last.next = head;
        if (prev != null) {
            prev.next = null;
        }
        return curr;
    }
}
