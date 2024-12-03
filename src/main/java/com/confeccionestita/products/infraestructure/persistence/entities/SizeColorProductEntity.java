package com.confeccionestita.products.infraestructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sizes_color_product")
public class SizeColorProductEntity {

    @EmbeddedId
    private SizeColorProductId id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @ManyToOne
    @MapsId("colorId")
    @JoinColumn(name = "color_id")
    private ColorEntity color;

    @ManyToOne
    @MapsId("sizeId")
    @JoinColumn(name = "size_id")
    private SizeEntity size;

    private Integer stock;

}
