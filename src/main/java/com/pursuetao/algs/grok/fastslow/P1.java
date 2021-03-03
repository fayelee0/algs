package com.pursuetao.algs.grok.fastslow;

import com.pursuetao.algs.grok.ListNode;

// Rearrange a LinkedList
// Given the head of a Singly LinkedList, write a method to modify the LinkedList such that the nodes from the second half of the LinkedList are inserted alternately to the nodes from the first half in reverse order.
// So if the LinkedList has nodes 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null, your method should return 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> null.
public class P1 {
    // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> .
    //                S
    //                6 -> 5 -> 4 -> .
    // 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> .
    //
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static void reorder(ListNode head) {
        if (head != null && head.next != null) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode revs = reverse(slow);
            while (revs != null) {
                ListNode headNext = head.next;
                ListNode revsNext = revs.next;
                head.next = revs;
                revs.next = headNext;
                head = headNext;
                revs = revsNext;
            }

            if (head != null) {
                head.next = null;
            }
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
