/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.library.management.system;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
// Member class representing a library member
class Member {
// Private attributes
private String memberId;
private String name;
private ArrayList<Book> booksBorrowed;
// Parameterized constructor
public Member(String memberId, String name) {
this.memberId = memberId;
this.name = name;


this.booksBorrowed = new ArrayList<>();
}
// Method to borrow a book
public void borrowBook(Book book) {
if (book.isAvailable()) {
booksBorrowed.add(book);
book.setAvailable(false); // Mark the book as unavailable
System.out.println(name + " borrows " + book.getTitle() + "...");
System.out.println("Book Borrowed: " + book.getTitle());
} else {
System.out.println(name + " tries to borrow " + book.getTitle() + "...");
System.out.println(book.getTitle() + " is currently unavailable.");
}
displayBorrowedBooks();
}
// Method to return a book
public void returnBook(Book book) {
if (booksBorrowed.contains(book)) {
booksBorrowed.remove(book);
book.setAvailable(true); // Mark the book as available
System.out.println(name + " returns " + book.getTitle() + "...");
System.out.println("Book Returned: " + book.getTitle());
} else {
System.out.println(name + " did not borrow " + book.getTitle() + ".");
}
displayBorrowedBooks();
}
// Method to display borrowed books
public void displayBorrowedBooks() {
System.out.print("Books Borrowed by " + name + ": [");
for (Book book : booksBorrowed) {
System.out.print(book.getTitle() + ", ");
}
System.out.println("]");
}
}
