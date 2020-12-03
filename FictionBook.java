package com.company;

public class FictionBook extends Book{
    private int soldBooks;
    private int edition;

    public FictionBook(String bookTitle, int soldBooks, int edition){
        super(bookTitle);
        setSoldBooks(soldBooks);
        setEdition(edition);
    }

    public int getSoldBooks() {
        return soldBooks;
    }

    public void setSoldBooks(int soldBooks) {
        this.soldBooks = soldBooks;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public double popularity(){
        double cast = getSoldBooks();
        double s =(cast/getEdition()*(cast/1000) );
        return s;
    }

}
