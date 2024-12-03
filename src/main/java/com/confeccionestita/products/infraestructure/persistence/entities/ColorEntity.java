package com.confeccionestita.products.infraestructure.persistence.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "colors")
public class ColorEntity {

    @Id
    @Column(name = "color_id")
    private Integer colorId;

    @Column(name = "color_name")
    private String colorName;
    private String hexadecimal;

}
