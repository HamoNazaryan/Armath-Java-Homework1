package com.company;

public class Book {
    private String bookTitle;

    public Book(String bookTitle){
        setBookTitle(bookTitle);
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

}
