package com.pursuetao.algs.grok.fastslow;

import com.pursuetao.algs.grok.ListNode;

// Start of LinkedList Cycle
// Given the head of a Singly LinkedList that contains a cycle, write a function to find the starting node of the cycle.
public class S2 {
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static ListNode findCycleStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int length = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                length = calcCycleStart(slow);
                break;
            }
        }

        return findStart(head, length);
    }

    private static int calcCycleStart(ListNode slow) {
        ListNode node = slow;

        int length = 0;
        do {
            node = node.next;
            length++;
        } while (node != slow);
        return length;
    }

    private static ListNode findStart(ListNode head, int length) {
        ListNode p0 = head;
        ListNode p1 = head;

        while (length != 0) {
            p0 = p0.next;
            length--;
        }

        while (p0 != p1) {
            p0 = p0.next;
            p1 = p1.next;
        }

        return p0;
    }

}
