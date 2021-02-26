package com.pursuetao.algs.grok.fastslow;

// Palindrome LinkedList
// Given the head of a Singly LinkedList, write a method to check if the LinkedList is a palindrome or not.
//
// Your algorithm should use constant space and the input LinkedList should be in the original form once the algorithm is finished.
// The algorithm should have O(N) time complexity where ‘N’ is the number of nodes in the LinkedList.
public class P0 {
    // 2 -> 4 -> 6 -> 4 -> 2 -> .
    //           S
    //           2 -> 4 -> 6 -> .
    //           6 -> 4 -> 2 -> .
    //
    // 2 -> 4 -> 6 -> 4 -> 2 -> 2 -> .
    //                S
    //                2 -> 2 -> 4 -> .
    //                4 -> 2 -> 2 -> .
    //
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {     // O(N)
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode revs = reverse(slow);                  // O(N)
        ListNode temp = revs;

        while (head != null && revs != null) {          // O(N)
            if (head.value != revs.value) {
                break;
            } else {
                head = head.next;
                revs = revs.next;
            }
        }

        reverse(temp);                                  // O(N)
        return head == null || revs == null;
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
