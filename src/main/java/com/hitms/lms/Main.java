package com.hitms.lms;

import com.hitms.lms.exception.BookUnavailableException;
import com.hitms.lms.exception.MemberNotFoundException;
import com.hitms.lms.model.Book;
import com.hitms.lms.model.Member;
import com.hitms.lms.service.LibraryService;
import com.hitms.lms.util.LibraryUtils;
import java.time.LocalDate;

/**
 * Driver class that imports and exercises the LMS modules.
 */
public class Main {

    /**
     * Entry point.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // Lab 03 Task 2 - reuse the util module
        System.out.println(LibraryUtils.formatTitle(" the great gatsby "));
        System.out.println(LibraryUtils.daysBetween(
                LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 15)));

        // Lab 03 deliverable - service module: add / issue / return
        LibraryService service = new LibraryService();
        service.addBook(new Book("978-0132350884", "Clean Code", "Robert C. Martin", 1));
        service.registerMember(new Member("M-065", "Syed Ahmer Shah"));

        try {
            service.issueBook("M-065", "978-0132350884");
            System.out.println("Issued:   " + service.getBook("978-0132350884"));
            service.issueBook("M-065", "978-0132350884");
        } catch (BookUnavailableException | MemberNotFoundException e) {
            System.out.println("Error:    " + e.getMessage());
        }

        try {
            service.returnBook("M-065", "978-0132350884");
            System.out.println("Returned: " + service.getBook("978-0132350884"));
        } catch (MemberNotFoundException e) {
            System.out.println("Error:    " + e.getMessage());
        }
    }
}
