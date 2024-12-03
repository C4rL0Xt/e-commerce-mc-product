package com.confeccionestita.products.presentation.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetailsProductDTO {

    private String id;
    private Float price;
    private String description;
    private String materialName;
    private String genderName;
    private String seasonName;
    private String type;
    private List<DetailsProductColorDTO> colors;

}
