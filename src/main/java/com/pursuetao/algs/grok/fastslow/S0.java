package com.pursuetao.algs.grok.fastslow;

// LinkedList Cycle
// Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.
public class S0 {
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
