package com.confeccionestita.products.application.util;

import com.confeccionestita.products.domain.models.Style;
import com.confeccionestita.products.presentation.dtos.StyleDTO;
import com.confeccionestita.products.presentation.dtos.TypeDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StyleTypeDtoConverter {

    public static List<StyleDTO> listObjectToStyleTypeDto(List<Object[]> list) {

        Map<String, StyleDTO> map = new HashMap<>();

        for (Object[] obj : list) {
            if (obj == null)
                    throw new NullPointerException("obj is null");

            String first = (String) obj[0];
            List<TypeDTO> typeDTOs = new ArrayList<>();
            StyleDTO styleDTO = map.computeIfAbsent(first, k -> new StyleDTO(first,typeDTOs));
            TypeDTO typeDTO = new TypeDTO();
            typeDTO.setTypeName(obj[1].toString());
            styleDTO.getTypes().add(typeDTO);

        }

        return new ArrayList<>(map.values());
    }


}
