package com.hitms.lab04;

/**
 * Lab 04 Task 1 - basic exception handling.
 */
public class DivisionDemo {

    /**
     * Divides two integers.
     *
     * @param numerator the value to divide
     * @param denominator the value to divide by
     * @return the integer quotient
     * @throws ArithmeticException if denominator is zero
     */
    public static int safeDivide(int numerator, int denominator) {
        return numerator / denominator;
    }

    /**
     * Driver method.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + safeDivide(10, 2));
            System.out.println("Result: " + safeDivide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Division demo finished.");
        }
    }
}
