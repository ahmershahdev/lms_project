package com.hitms.lms.model;

/**
 * A registered library member.
 */
public class Member {
    /** Maximum number of books one member may borrow at a time. */
    public static final int MAX_BORROW_LIMIT = 3;

    private final String memberId;
    private final String fullName;
    private int borrowedCount;

    /**
     * Creates a new member.
     *
     * @param memberId unique member ID (e.g. "M-001")
     * @param fullName member's full name
     */
    public Member(String memberId, String fullName) {
        this.memberId = memberId;
        this.fullName = fullName;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    /**
     * Returns true if the member is still below the borrowing limit.
     *
     * @return whether another book can be borrowed
     */
    public boolean canBorrow() {
        return borrowedCount < MAX_BORROW_LIMIT;
    }

    /** Records that the member has borrowed one more book. */
    public void incrementBorrowed() {
        borrowedCount++;
    }

    /** Records that the member has returned one book. */
    public void decrementBorrowed() {
        borrowedCount--;
    }

    @Override
    public String toString() {
        return memberId + " - " + fullName;
    }
}
