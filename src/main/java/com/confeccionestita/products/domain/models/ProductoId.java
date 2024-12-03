package com.confeccionestita.products.domain.models;

// ? Value Object
public record ProductoId (
        String id
) {

    public ProductoId(String id) {
        this.id = id;
    }

}
