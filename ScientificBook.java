package com.company;

public class ScientificBook extends Book{
    int priceOfBook;
    int numberOfPages;
    int numberOfGivenLibraries;

    public ScientificBook(String bookTitle, int priceOfBook, int numberOfPages, int numberOfGivenLibraries){
        super(bookTitle);
        setPriceOfBook(priceOfBook);
        setNumberOfPages(numberOfPages);
        setNumberOfGivenLibraries(numberOfGivenLibraries);
    }

    public int getPriceOfBook() {
        return priceOfBook;
    }

    public void setPriceOfBook(int priceOfBook) {
        this.priceOfBook = priceOfBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfGivenLibraries() {
        return numberOfGivenLibraries;
    }

    public void setNumberOfGivenLibraries(int numberOfGivenLibraries) {
        this.numberOfGivenLibraries = numberOfGivenLibraries;
    }

    public double expensive(){
        double cast = getPriceOfBook();
        double s = cast/getNumberOfPages();
        return s;
    }

}
