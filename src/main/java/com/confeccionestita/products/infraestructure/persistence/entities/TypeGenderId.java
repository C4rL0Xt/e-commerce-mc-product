package com.confeccionestita.products.infraestructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TypeGenderId {

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "gender_id")
    private Integer genderId;
}
