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
public class DetailsProductColorDTO {

    private String colorName;
    private List<DetailsProductSizeDTO> productSizes;
}
