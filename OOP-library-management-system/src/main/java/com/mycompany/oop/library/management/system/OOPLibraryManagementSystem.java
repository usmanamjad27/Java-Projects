/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop.library.management.system;

/**
 *
 * @author Dell
 */
public class OOPLibraryManagementSystem {

    public static void main(String[] args) {
     
// Create books
Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
Book book2 = new Book("B002", "1984", "George Orwell");
// Create a member
Member member = new Member("M101", "John Doe");
// Display initial book status
System.out.println("Welcome to the Library Management System!\n");
System.out.println("Book Added: " + book1.getTitle() + " by " + book1.getAuthor() + "Available: " + book1.isAvailable() + ")");



System.out.println("Book Added: " + book2.getTitle() + " by " + book2.getAuthor() + "Available: " + book2.isAvailable() + ")\n");
// Simulate borrowing and returning books
member.borrowBook(book1); // John borrows The Great Gatsby
System.out.println();
member.borrowBook(book2); // John tries to borrow 1984 (unavailable)
System.out.println();
member.returnBook(book1); // John returns The Great Gatsby
System.out.println();
member.borrowBook(book2); // John borrows 1984
    }
}
