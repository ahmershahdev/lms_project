package com.hitms.lab02;

/**
 * Lab 02 Task 1 - refactored version of the poorly named "calc" class.
 */
public class AreaCalculator {

    /**
     * Returns the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return the area (length x width)
     */
    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    /**
     * Small driver to show the renamed method still works.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Area of 5 x 4 rectangle = " + calculateArea(5, 4));
    }
}
