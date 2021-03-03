package com.pursuetao.algs.grok.fastslow;

// Happy Number
// Any number will be called a happy number if, after repeatedly replacing it with a number equal to the sum of the square of all of its digits, leads us to number ‘1’. All other (not-happy) numbers will never reach ‘1’. Instead, they will be stuck in a cycle of numbers which does not include ‘1’.
public class S3 {
    // Time Complexity O(lgN)
    // Space Complexity O(1)
    public static boolean find(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int squareSum(int num) {
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum += n * n;
            num /= 10;
        }
        return sum;
    }
}
