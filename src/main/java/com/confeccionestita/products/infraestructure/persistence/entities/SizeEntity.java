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
@Table(name = "sizes")
public class SizeEntity {

    @Id
    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "size_name")
    private String sizeName;
}
