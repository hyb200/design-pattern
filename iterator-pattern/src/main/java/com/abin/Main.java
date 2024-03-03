package com.abin;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        for (int i = 0; i < 10; i++) {
            bookShelf.appendBook(new Book(String.format("Book %c", i + 'A')));
        }

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book next = (Book) it.next();
            System.out.println(next.getName());
        }
    }
}