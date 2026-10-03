package com.hitms.lab04;

/**
 * Lab 04 Task 3 - debugging practice (buggy and fixed findMax).
 */
public class MaxFinder {

    /**
     * Original buggy version, kept for comparison.
     *
     * @param numbers the numbers to search
     * @return the (wrong) maximum for all-negative arrays
     */
    public static int findMaxBuggy(int[] numbers) {
        int maxValue = 0;
        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    /**
     * Returns the largest number in a non-empty array.
     *
     * @param numbers the numbers to search
     * @return the largest value
     */
    public static int findMax(int[] numbers) {
        int maxValue = numbers[0]; // start from the first number, not 0
        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    /**
     * Driver method.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        int[] negatives = {-5, -2, -9};
        System.out.println("Buggy findMax({-5, -2, -9}) = " + findMaxBuggy(negatives));
        System.out.println("Fixed findMax({-5, -2, -9}) = " + findMax(negatives));
    }
}
