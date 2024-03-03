package com.abin;

/**
 * 定义具体的迭代器
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getBooksCount();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index ++);
        return book;
    }
}
