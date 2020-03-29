package Klausur1.Books;

import java.util.ArrayList;

public class Bibliothek {

    private ArrayList<Book> books = new ArrayList<Book>();



    public void addBook(Book b) {
        books.add(b);
    }

    public int countPages() {
        int seitenzahl = 0;
        for(Book book : books){
            seitenzahl = seitenzahl + book.getSeiten();
        }
        return seitenzahl;
    }

    public double avaragePages() {
        double seitenSumme = 0;
        int counter = 0;
        double seitendurchschnitt;

        for (Book book : books){
            seitenSumme = seitenSumme + book.getSeiten();
            counter++;
        }
        seitendurchschnitt = seitenSumme/counter;
        return seitendurchschnitt;
    }

    public ArrayList<Book> booksByAuthor(String autor) {
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();
        for(Book book : books){
            if (book.getAutor().equals(autor)){
                booksByAuthor.add(book);
            } }
        return booksByAuthor;
    }

    public ArrayList<Book> findBook(String search) {
        ArrayList<Book> findBookArray = new ArrayList<Book>();
        for(Book book : books){
            if(book.match(search) == true){
                findBookArray.add(book);
            } }
        return findBookArray;
    }

}

