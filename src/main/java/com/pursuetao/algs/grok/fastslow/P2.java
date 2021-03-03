package com.pursuetao.algs.grok.fastslow;

// Cycle in a Circular Array
//
public class P2 {
    // Time Complexity O(N^2)
    // Space Complexity O(1)
    public static boolean loopExists(int[] arr) {
        for (int i = 0; i < arr.length; i++) {                              // N
            boolean isForward = arr[i] >= 0;

            int slow = i;
            int fast = i;
            do {
                slow = findNextIndex(arr, isForward, slow);
                fast = findNextIndex(arr, isForward, fast);
                if (fast != -1) {
                    fast = findNextIndex(arr, isForward, fast);
                }
            } while (slow != -1 && fast != -1 && slow != fast);             // N

            if (slow != -1 && slow == fast) {
                return true;
            }
        }

        return false;
    }

    private static int findNextIndex(int[] arr, boolean isForward, int currIndex) {
        boolean direction = arr[currIndex] > 0;
        if (isForward != direction) {
            return -1;
        }

        int nextIndex = (currIndex + arr[currIndex]) % arr.length;
        if (nextIndex < 0) {
            nextIndex += arr.length;
        }

        if (nextIndex == currIndex) {
            nextIndex = -1;
        }

        return nextIndex;
    }
}
