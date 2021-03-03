package com.pursuetao.algs.grok.fastslow;

// Middle of the LinkedList
// Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.
// If the total number of nodes in the LinkedList is even, return the second middle node.
public class S4 {
    // 1 -> 2 -> 3
    //      S    F
    //
    // 1 -> 2 -> 3 -> 4 -> .
    //      S    F
    //           S         F
    //
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
