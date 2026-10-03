package com.hitms.lms.exception;

/**
 * Thrown when a book cannot be issued because no copies are left.
 */
public class BookUnavailableException extends Exception {

    /**
     * Creates the exception with a descriptive message.
     *
     * @param message details of the failure
     */
    public BookUnavailableException(String message) {
        super(message);
    }
}
