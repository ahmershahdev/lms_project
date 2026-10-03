package com.hitms.lms.exception;

/**
 * Thrown when a member ID does not match any registered member.
 */
public class MemberNotFoundException extends Exception {

    /**
     * Creates the exception with a descriptive message.
     *
     * @param message details of the failure
     */
    public MemberNotFoundException(String message) {
        super(message);
    }
}
