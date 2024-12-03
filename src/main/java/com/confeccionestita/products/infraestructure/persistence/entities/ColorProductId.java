package com.confeccionestita.products.infraestructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ColorProductId {

    @Column(name = "product_id")
    private String productId;

    @Column(name = "color_id")
    private String colorId;
}
