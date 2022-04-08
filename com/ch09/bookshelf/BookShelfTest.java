package com.company.example.ch09.bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("강서구2");
        shelfQueue.enQueue("강셔구2");
        shelfQueue.enQueue("걍서구2");
        shelfQueue.enQueue("강서꾸2");

        System.out.println(shelfQueue.deQuede());
        System.out.println(shelfQueue.deQuede());
        System.out.println(shelfQueue.deQuede());

    }
}
