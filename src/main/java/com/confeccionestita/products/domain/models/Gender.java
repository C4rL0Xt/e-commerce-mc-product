package com.confeccionestita.products.domain.models;

// ? Value Object
public record Gender(
        String gender_name
) {

    public Gender(String gender_name) {
        this.gender_name = gender_name;
    }

}
