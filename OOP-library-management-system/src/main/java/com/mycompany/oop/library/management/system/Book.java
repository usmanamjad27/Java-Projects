/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.library.management.system;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
// Book class representing a book in the library
class Book {
// Private attributes
private String bookId;
private String title;
private String author;
private boolean isAvailable;
// Parameterized constructor
public Book(String bookId, String title, String author) {
this.bookId = bookId;
this.title = title;
this.author = author;
this.isAvailable = true; // By default, the book is available
}
// Getter methods
public String getBookId() {
return bookId;
}
public String getTitle() {
return title;
}
public String getAuthor() {
return author;
}
public boolean isAvailable() {
return isAvailable;
}
// Setter method for availability
public void setAvailable(boolean isAvailable) {
this.isAvailable = isAvailable;
}
}
