package com.confeccionestita.products.infraestructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SizeColorProductId implements Serializable {

    @Column(name = "product_id")
    private String productId;
    @Column(name = "color_id")
    private Integer colorId;
    @Column(name = "size_id")
    private Integer sizeId;
}
