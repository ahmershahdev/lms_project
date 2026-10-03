package com.hitms.lab04;

import com.hitms.lms.exception.BookUnavailableException;
import com.hitms.lms.exception.MemberNotFoundException;
import com.hitms.lms.service.LibraryService;

/**
 * Lab 04 Task 2 - custom checked exceptions in the LMS.
 */
public class IssueBookDemo {

    /**
     * Driver showing one successful issue and two handled failures.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        try {
            System.out.println("Remaining copies: " + LibraryService.issueBook(3, "Clean Code"));
            LibraryService.issueBook(0, "Clean Code");
        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        LibraryService service = new LibraryService();
        try {
            service.findMemberById("M-999");
        } catch (MemberNotFoundException e) {
            System.out.println("Lookup failed: " + e.getMessage());
        }
    }
}
