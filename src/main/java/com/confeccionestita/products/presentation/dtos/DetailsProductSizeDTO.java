package com.confeccionestita.products.presentation.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetailsProductSizeDTO {

    private String sizeName;
    private int stock;
}
