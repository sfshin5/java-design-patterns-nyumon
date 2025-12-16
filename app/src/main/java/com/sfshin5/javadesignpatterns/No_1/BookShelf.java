package com.sfshin5.javadesignpatterns.No_1;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }  
}