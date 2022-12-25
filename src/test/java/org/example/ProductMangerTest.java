package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManger manger = new ProductManger(repo);

    Book book1 = new Book(1, "Tomland", 100, "Alexander");
    Book book2 = new Book(2, "Tomland2", 100, "Alexander2");
    Book book3 = new Book(3, "Tomland3", 100, "Alexander3");

    SmartPhone smartPhone1 = new SmartPhone(1, "IPhone", 100,"Apple");
    SmartPhone smartPhone2 = new SmartPhone(2, "IPhone2", 100,"Apple2");
    SmartPhone smartPhone3 = new SmartPhone(3, "IPhone3", 100, "Apple3");



     @Test
    public void search1() {

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] actual = manger.searchBy("Tomland2");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void search() {

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] actual = manger.searchBy("Tomland");
        Product[] expected = {book1,book2,book3};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void addBook() {

        manger.add(book1);
        manger.add(book2);
        manger.add(book3);

    Product[] actual = repo.findAll();
    Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
}

    @Test
    public void addSmartphone() {

        manger.add(smartPhone1);
        manger.add(smartPhone2);
        manger.add(smartPhone3);

        Product[] actual = repo.findAll();
        Product[] expected = {smartPhone1, smartPhone2, smartPhone3};

        Assertions.assertArrayEquals(expected, actual);
    }






}

