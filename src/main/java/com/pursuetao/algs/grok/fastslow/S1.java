package com.pursuetao.algs.grok.fastslow;

import com.pursuetao.algs.grok.ListNode;

// Cycle LinkedList Length
// Given the head of a LinkedList with a cycle, find the length of the cycle.
public class S1 {
    public static int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return calculateLength(slow);
            }
        }

        return 0;
    }

    private static int calculateLength(ListNode slow) {
        ListNode node = slow;
        int length = 0;
        do {
            node = node.next;
            length++;
        } while (node != slow);
        return length;
    }
}
