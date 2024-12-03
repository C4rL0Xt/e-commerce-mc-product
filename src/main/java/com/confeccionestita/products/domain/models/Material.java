package com.confeccionestita.products.domain.models;

// ? Value Object
public record Material(
        String material_name
) {

    public Material(String material_name) {
        this.material_name = material_name;
    }

}
