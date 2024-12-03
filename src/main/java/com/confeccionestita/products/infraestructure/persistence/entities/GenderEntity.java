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
@Table(name = "genders")
public class GenderEntity {

    @Id
    @Column(name = "gender_id")
    private Integer genderId;

    @Column(name = "gender_name")
    private String genderName;
}
