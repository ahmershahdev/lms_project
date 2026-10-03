package com.hitms.lab02;

/**
 * Lab 02 Task 2 - helper methods for working with item prices.
 */
public class PriceUtils {

    /**
     * Returns the sum of a list of item prices.
     *
     * @param prices the item prices
     * @return the total of all prices
     */
    public static double total(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price; // accumulate running total
        }
        return sum;
    }

    /**
     * Returns the average of a list of item prices.
     *
     * @param prices the item prices
     * @return the mean price
     */
    public static double average(double[] prices) {
        return total(prices) / prices.length;
    }

    /**
     * Small driver that prints the total and average of sample prices.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        double[] bookPrices = {1200.0, 850.5, 999.5};
        System.out.println("Total price   = " + total(bookPrices));
        System.out.println("Average price = " + average(bookPrices));
    }
}
