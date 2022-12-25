package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository repo = new ProductRepository();

    Book book1 = new Book(1, "Tomland", 100, "Alexander");
    Book book2 = new Book(2, "Tomland2", 100, "Alexander2");
    Book book3 = new Book(3, "Tomland3", 100, "Alexander3");

    SmartPhone smartPhone1 = new SmartPhone(1, "IPhone", 100,"Apple");
    SmartPhone smartPhone2 = new SmartPhone(2, "IPhone2", 100,"Apple2");
    SmartPhone smartPhone3 = new SmartPhone(3, "IPhone3", 100, "Apple3");

    @Test
    public void repositoryRemove() {

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(2);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add() {

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void author() {

        book1.getAuthor();

        String expected = "Alexander";
        String actual = book1.getAuthor();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void smartPhone() {

        smartPhone1.getVendor();

        String expected = "Apple";
        String actual = smartPhone1.getVendor();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPrice() {

        book1.getPrice();

        int expected = 100;
        int actual = book1.getPrice();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void repositoryRemoveSmart() {

        repo.add(smartPhone1);
        repo.add(smartPhone2);
        repo.add(smartPhone3);
        repo.removeById(2);

        Product[] actual = repo.findAll();
        Product[] expected = {smartPhone1, smartPhone3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSmart() {

        repo.add(smartPhone1);
        repo.add(smartPhone2);
        repo.add(smartPhone3);

        Product[] actual = repo.findAll();
        Product[] expected = {smartPhone1, smartPhone2, smartPhone3};

        Assertions.assertArrayEquals(expected, actual);
    }









}

