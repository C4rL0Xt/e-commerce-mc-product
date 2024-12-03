package com.confeccionestita.products.domain.models;

import java.util.List;

// * Domain Entity
public class ProductColor {

    private String color;
    private String hexadecimal;
    private String image; // * URL image
    private List<StockSize> sizes;

    public ProductColor(String color, String hexadecimal, String image, List<StockSize> sizes) {
        this.color = color;
        this.hexadecimal = hexadecimal;
        this.image = image;
        this.sizes = sizes;
    }

    // * Update the data of a product color
    public void updateDataProductColor(String color, String hexadecimal, String image) {
        this.color = color;
        this.hexadecimal = hexadecimal;
        this.image = image;
    }

    //* Add a new size to a producto with a specific color
    public void addSize(StockSize size) {
        this.sizes.add(size);
    }

    //* Change the image of a product
    public void changeImage(String newImage) {
        this.image = newImage;
    }

    // * Find a size into the list by a product color
    public StockSize findSize(Size size) {
        StockSize found = sizes.stream().filter(s -> s.getSize().equals(size)).findFirst().orElse(null);
        if (found == null) {
            throw new NullPointerException("No se encontro la talla buscada");
        } else {
            return found;
        }
    }

    // * Change the color of a product
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // * Change the hexadecimal of a color
    public void changeHexadecimal(String newHexadecimal) {
        this.hexadecimal = newHexadecimal;
    }


    public String getColor() {
        return color;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public String getImage() {
        return image;
    }

    public List<StockSize> getSizes() {
        return sizes;
    }

}
