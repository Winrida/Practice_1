package ru.mirea.pr1;

public class Book {
    public String genre;
    public String author;

    public Book(String genre, String author)
    {
        this.genre = genre;
        this.author = author;
    }

    public void BookInfo(){
        System.out.println(genre + " book written by " + author + '.');
    }
}
