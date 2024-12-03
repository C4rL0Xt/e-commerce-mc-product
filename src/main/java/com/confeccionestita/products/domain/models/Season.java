package com.confeccionestita.products.domain.models;

// ? Value Object
public record Season(
        String season_name
) {

    public Season(String season_name) {
        this.season_name = season_name;
    }
}
