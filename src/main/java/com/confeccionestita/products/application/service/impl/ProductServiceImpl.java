package com.confeccionestita.products.application.service.impl;

import com.confeccionestita.products.application.service.IProductService;
import com.confeccionestita.products.application.util.ProductDtoConverter;
import com.confeccionestita.products.infraestructure.persistence.repositories.ProductRepository;
import com.confeccionestita.products.presentation.dtos.DetailsProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<DetailsProductDTO> getProducts() {
        List<Object[]> products = productRepository.findProducts();
        List<DetailsProductDTO> productDTOs = ProductDtoConverter.listObjectToListDetailsProductDto(products);
        return productDTOs;
    }

    @Override
    public DetailsProductDTO getProductById(String id) {
        List<Object[]> product = productRepository.findProductById(id);
        return ProductDtoConverter.listObjectToDetailsProductDTO(product);
    }
}
