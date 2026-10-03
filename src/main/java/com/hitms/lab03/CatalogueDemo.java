package com.hitms.lab03;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 03 Task 3 - the loosely coupled "Version B" Catalogue in use.
 */
public class CatalogueDemo {

    /**
     * Adds a title to the given catalogue and returns it.
     *
     * @param catalogue the catalogue to add to
     * @param title the title to add
     * @return the same catalogue, for chaining
     */
    public static List<String> addItem(List<String> catalogue, String title) {
        catalogue.add(title);
        return catalogue;
    }

    /**
     * Returns the number of items in the catalogue.
     *
     * @param catalogue the catalogue to count
     * @return number of titles
     */
    public static int itemCount(List<String> catalogue) {
        return catalogue.size();
    }

    /**
     * Driver method - two independent catalogues, no shared static state.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        List<String> fiction = new ArrayList<>();
        List<String> computing = new ArrayList<>();
        addItem(fiction, "The Great Gatsby");
        addItem(computing, "Clean Code");
        addItem(computing, "Code Complete");
        System.out.println("Fiction items:   " + itemCount(fiction));
        System.out.println("Computing items: " + itemCount(computing));
    }
}
