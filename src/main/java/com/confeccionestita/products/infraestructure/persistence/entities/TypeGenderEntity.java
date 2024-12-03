package com.confeccionestita.products.infraestructure.persistence.entities;


import com.confeccionestita.products.domain.models.Gender;
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
@Table(name = "type_genders")
public class TypeGenderEntity {

    @EmbeddedId
    private TypeGenderId id;

    @ManyToOne
    @MapsId("genderId")
    @JoinColumn(name = "gender_id")
    private GenderEntity gender;


    @ManyToOne
    @MapsId("typeId")
    @JoinColumn(name = "type_id")
    private TypeEntity type;

}
