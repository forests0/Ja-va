package com.company.example.ch09.bookshelf;

public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQuede() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
