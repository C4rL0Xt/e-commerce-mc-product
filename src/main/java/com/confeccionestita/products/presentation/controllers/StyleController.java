package com.confeccionestita.products.presentation.controllers;

import com.confeccionestita.products.application.service.ITypeService;
import com.confeccionestita.products.presentation.dtos.StyleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StyleController {

    private final ITypeService typeService;

    @Autowired
    public StyleController(ITypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/styles/{name}")
    public List<StyleDTO> listAllStyles(@PathVariable String name) {
        return typeService.getStyles(name);
    }
}
