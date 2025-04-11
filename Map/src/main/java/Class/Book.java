package main.java.Class;

import java.util.Objects;

class Book implements Comparable<Book> {
    private String author;
    private String title;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Book)) return false;
        Book o = (Book) obj;
        return this.getAuthor().equals(o.getAuthor()) && this.getTitle().equals(o.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle());
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
