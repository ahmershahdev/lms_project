package com.hitms.lab03;

/**
 * Lab 03 Task 1 - the "one long block" split into two focused methods.
 */
public class ReportUtil {

    /**
     * Returns the average of an array of numeric scores.
     *
     * @param scores the scores to average
     * @return the arithmetic mean
     */
    public static double calculateAverage(int[] scores) {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return (double) total / scores.length;
    }

    /**
     * Prints a short summary for an array of scores.
     *
     * @param scores the scores to report on
     */
    public static void printReport(int[] scores) {
        System.out.println("Average: " + calculateAverage(scores));
    }

    /**
     * Driver method.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        int[] studentScores = {78, 92, 55, 88};
        printReport(studentScores);
    }
}
