package Klausur1.Books;

public class Book {

    String autor;
    String titel;
    int seiten;

    public Book(String autor, String titel, int seiten) {
        this.autor = autor;
        this.titel = titel;
        this.seiten = seiten;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    public int getSeiten() {
        return seiten;
    }

    public boolean match(String search) {
        if(titel.contains(search) || autor.contains(search)){
            return true;
        } else{ return false;}
    }

    public String toString (){
        return String.format("[%s,%s,%d]", autor, titel, seiten);
    }

}
