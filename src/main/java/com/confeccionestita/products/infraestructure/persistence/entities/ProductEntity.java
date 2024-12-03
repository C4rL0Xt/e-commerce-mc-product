package com.confeccionestita.products.infraestructure.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    private String productId;

    private String description;
    private Float price;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private SeasonEntity season;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private MaterialEntity material;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private GenderEntity gender;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeEntity type;

}
