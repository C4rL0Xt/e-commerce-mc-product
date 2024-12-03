package com.confeccionestita.products.application.service;

import com.confeccionestita.products.presentation.dtos.DetailsProductDTO;

import java.util.List;

public interface IProductService {

    // ! test, get all product
    List<DetailsProductDTO> getProducts();

    // * this is for each product, efficent
    DetailsProductDTO getProductById(String id);

}
