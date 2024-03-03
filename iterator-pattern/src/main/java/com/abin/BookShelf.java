package com.abin;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{

    private List<Book> books;

    public BookShelf(int size) {
        this.books = new ArrayList<>(size);
    }

    public Book getBookAt(int idx) {
        return books.get(idx);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getBooksCount() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
