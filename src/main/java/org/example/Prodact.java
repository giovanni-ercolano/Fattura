package org.example;

public class Prodact {

    private final String[] product;

    public Prodact(String[] product) {
        this.product = product;
    }

    public String[] getProduct() {
        return product;
    }

    public int getQuantity() {
        return product.length;
    }
}
