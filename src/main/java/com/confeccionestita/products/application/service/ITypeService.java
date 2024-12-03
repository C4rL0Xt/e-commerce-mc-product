package com.confeccionestita.products.application.service;

import com.confeccionestita.products.presentation.dtos.StyleDTO;

import java.util.List;

public interface ITypeService {

    List<StyleDTO> getStyles(String name);
}
