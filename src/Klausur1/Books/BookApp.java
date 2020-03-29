package Klausur1.Books;

import java.util.ArrayList;
import java.util.Arrays;

public class BookApp {
    public static void main(String[] args) {
        Book a = new Book("Hemingway","In einem anderen Land", 290);
        Book b = new Book("Staeding", "Petronella Apfelmus 1", 187 );
        Book c = new Book("Staeding", "Petronella Apfelmus 2", 155);

        Bibliothek testBiblio = new Bibliothek();

        testBiblio.addBook(a);
        testBiblio.addBook(b);
        testBiblio.addBook(c);

        //Wie kann ich testBiblio ausgeben lassen?
        System.out.println(testBiblio.avaragePages());
        System.out.println(testBiblio.countPages());

        ArrayList<Book> autor = new ArrayList<Book>();
        autor = testBiblio.booksByAuthor("Hemingway");
        System.out.println(Arrays.toString(autor.toArray()));

        ArrayList<Book> search = new ArrayList<Book>();
        search = testBiblio.findBook("Petronella");
        System.out.println(Arrays.toString(search.toArray()));

    }
}
