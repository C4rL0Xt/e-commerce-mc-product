package com.confeccionestita.products.presentation.controllers;

import com.confeccionestita.products.application.service.IProductService;
import com.confeccionestita.products.presentation.dtos.DetailsProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/list")
    public List<DetailsProductDTO> getProductsWithDetails() {
        return productService.getProducts();
    }


    @GetMapping("/details/{id}")
    public DetailsProductDTO getProductById(@PathVariable("id") String id) {
        return productService.getProductById(id);
    }
}
