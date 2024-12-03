package com.confeccionestita.products.domain.exceptions;

public class ColorNotFoundException extends RuntimeException {

    private final String message;


    public ColorNotFoundException(String color) {
        this.message = "No se encuentra el color " + color;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
