package com.confeccionestita.products.domain.exceptions;

public class SizeNotFoundException extends RuntimeException {

    private final String message;

    public SizeNotFoundException(String size) {
        this.message = "No se ha encontrado la talla: " + size;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
