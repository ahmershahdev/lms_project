package com.hitms.lms.service;

import com.hitms.lms.exception.BookUnavailableException;
import com.hitms.lms.exception.MemberNotFoundException;
import com.hitms.lms.model.Book;
import com.hitms.lms.model.Member;
import java.util.HashMap;
import java.util.Map;

/**
 * Business operations of the Library Management System:
 * adding books, registering members, issuing and returning books.
 */
public class LibraryService {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();

    /**
     * Adds a book to the catalogue.
     *
     * @param book the book to add
     */
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    /**
     * Registers a new member.
     *
     * @param member the member to register
     */
    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    /**
     * Looks up a member by ID.
     *
     * @param memberId the ID to search for
     * @return the matching member
     * @throws MemberNotFoundException if no member has that ID
     */
    public Member findMemberById(String memberId) throws MemberNotFoundException {
        Member member = members.get(memberId);
        if (member == null) {
            throw new MemberNotFoundException("No member found with ID " + memberId + ".");
        }
        return member;
    }

    /**
     * Returns the copy count after issuing one copy of title.
     *
     * @param availableCopies copies currently on the shelf
     * @param title title of the book being issued
     * @return copies left after the issue
     * @throws BookUnavailableException if availableCopies is 0
     */
    public static int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    /**
     * Issues a book from the catalogue to a member.
     *
     * @param memberId the borrowing member
     * @param isbn the ISBN of the book
     * @throws MemberNotFoundException if the member does not exist
     * @throws BookUnavailableException if the book has no copies left
     */
    public void issueBook(String memberId, String isbn)
            throws MemberNotFoundException, BookUnavailableException {
        Member member = findMemberById(memberId);
        Book book = books.get(isbn);
        if (book == null) {
            throw new BookUnavailableException("No book with ISBN " + isbn + " in the catalogue.");
        }
        if (!member.canBorrow()) {
            throw new BookUnavailableException(member.getFullName()
                    + " has reached the limit of " + Member.MAX_BORROW_LIMIT + " books.");
        }
        book.setAvailableCopies(issueBook(book.getAvailableCopies(), book.getTitle()));
        member.incrementBorrowed();
    }

    /**
     * Returns a previously issued book.
     *
     * @param memberId the returning member
     * @param isbn the ISBN of the book
     * @throws MemberNotFoundException if the member does not exist
     */
    public void returnBook(String memberId, String isbn) throws MemberNotFoundException {
        Member member = findMemberById(memberId);
        Book book = books.get(isbn);
        if (book != null && member.getBorrowedCount() > 0) {
            book.setAvailableCopies(book.getAvailableCopies() + 1);
            member.decrementBorrowed();
        }
    }

    /**
     * Returns the book with the given ISBN, or null.
     *
     * @param isbn the ISBN to look up
     * @return the book, or null if absent
     */
    public Book getBook(String isbn) {
        return books.get(isbn);
    }
}
