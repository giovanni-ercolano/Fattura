package org.example;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @org.junit.jupiter.api.Test
    void getDate() {
    }

    @org.junit.jupiter.api.Test
    void getSender() {
    }

    @org.junit.jupiter.api.Test
    void getRecipient() {
    }

    @org.junit.jupiter.api.Test
    void getProduct() {
        assertEquals(new String[]{"prodotto1", "prodotto2", "prodotto3", "prodotto4"}, new Invoice("12/12/2020", "company1", "company2", new String[]{"prodotto1", "prodotto2", "prodotto3", "prodotto4"}, 3).getProduct());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}