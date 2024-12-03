package com.confeccionestita.products.application.service.impl;

import com.confeccionestita.products.application.service.ITypeService;
import com.confeccionestita.products.application.util.StyleTypeDtoConverter;
import com.confeccionestita.products.infraestructure.persistence.repositories.TypeRepository;
import com.confeccionestita.products.presentation.dtos.StyleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements ITypeService {

    private final TypeRepository typeRepository;

    @Autowired
    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;

    }


    @Override
    public List<StyleDTO> getStyles(String name) {
        List<Object[]> list = typeRepository.findAllByGender(name.toLowerCase());
        return StyleTypeDtoConverter.listObjectToStyleTypeDto(list);
    }
}
