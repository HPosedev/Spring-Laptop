package com.example.springLaptop.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    Laptop laptop = new Laptop(1L, "Dell", "XPS", 15.6, 1500);
    Laptop laptop2 = new Laptop();
    @Test
    void getId() {
        Long result = laptop.getId();
        assertEquals(1L, result);
    }

    @Test
    void setId() {
        laptop.setId(2L);
        Long result = laptop.getId();
        assertEquals(2L, result);
    }

    @Test
    void getBrand() {
        String result = laptop.getBrand();
        assertEquals("Dell", result);
    }

    @Test
    void setBrand() {
        laptop.setBrand("Lenovo");
        String result = laptop.getBrand();
        assertEquals("Lenovo", result);
    }

    @Test
    void getModel() {
        String result = laptop.getModel();
        assertEquals("XPS", result);
    }

    @Test
    void setModel() {
        laptop.setModel("X580");
        String result = laptop.getModel();
        assertEquals("X580", result);
    }

    @Test
    void getScreen() {
        double result = laptop.getScreen();
        assertEquals(15.6, result);
    }

    @Test
    void setScreen() {
        laptop.setScreen(17);
        double result = laptop.getScreen();
        assertEquals(17, result);
    }

    @Test
    void getPrice() {
        int result = laptop.getPrice();
        assertEquals(1500, result);
    }

    @Test
    void setPrice() {
        laptop.setPrice(1450);
        int result = laptop.getPrice();
        assertEquals(1450, result);
    }
}