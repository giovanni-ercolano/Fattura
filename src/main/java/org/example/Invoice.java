package org.example;

import java.util.Arrays;

public class Invoice {

    private final String date;
    private final String sender;
    private final String recipient;
    private final String[] product;
    private final int quantity;

    public Invoice(String date, String sender, String recipient, String[] product, int quantity) {
        this.date = date;
        this.sender = sender;
        this.recipient = recipient;
        this.product = product;
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String[] getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "date='" + date + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", product=" + Arrays.toString(product) +
                ", quantity=" + quantity +
                '}';
    }
}
