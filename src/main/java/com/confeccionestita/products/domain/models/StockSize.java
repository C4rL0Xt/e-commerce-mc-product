package com.confeccionestita.products.domain.models;

// ? Domain Entity
public class StockSize {

    private Size size;
    private int stock;
    private boolean available;

    public StockSize(Size size, int stock) {
        this.size = size;
        this.stock = stock;
        this.available = true;
    }

    public void reduceStock(int quantity) {
        if(quantity>this.stock){
            throw new IllegalArgumentException("No hay suficiente stock");
        } else {
            this.stock -= quantity;
        }
    }

    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad a aumentar no puede ser negativa o 0");
        } else {
            this.stock += quantity;
        }
    }

    public void isAvailable() {
        this.available = this.stock > 0;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
