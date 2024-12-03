package com.confeccionestita.products.application.util;

import com.confeccionestita.products.presentation.dtos.DetailsProductColorDTO;
import com.confeccionestita.products.presentation.dtos.DetailsProductDTO;
import com.confeccionestita.products.presentation.dtos.DetailsProductSizeDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDtoConverter {

    public static DetailsProductDTO listObjectToDetailsProductDTO(List<Object[]> list){
        DetailsProductDTO productDTO = createDetailsProductDTO(list.get(0));
        for (Object[] object : list) {
            if (object == null)
                throw new IllegalArgumentException("Object array is null");

            // Obtener o crear el color dentro del producto
            String colorName = object[7].toString();
            DetailsProductColorDTO colorDTO = getOrCreateDetailsColorDTO(colorName, productDTO);

            // Crear la nueva talla
            DetailsProductSizeDTO sizeDTO = createDetailsProductSizeDTO(object);

            // Agregar la talla al color, si no existe ya
            if (!colorDTO.getProductSizes().contains(sizeDTO)) {
                colorDTO.getProductSizes().add(sizeDTO);
            }
        }
        return productDTO;
    }

    public static List<DetailsProductDTO> listObjectToListDetailsProductDto(List<Object[]> list) {
        Map<String, DetailsProductDTO> productMap = new HashMap<>();

        for (Object[] object : list) {
            if (object == null)
                throw new IllegalArgumentException("Object array is null");

            String productId = object[0].toString();

            // Obtener o crear el producto con computeIfAbsent
            DetailsProductDTO productDTO = productMap.computeIfAbsent(
                    productId, id -> createDetailsProductDTO(object)
            );

            // Obtener o crear el color dentro del producto
            String colorName = object[7].toString();
            DetailsProductColorDTO colorDTO = getOrCreateDetailsColorDTO(colorName, productDTO);

            // Crear la nueva talla
            DetailsProductSizeDTO sizeDTO = createDetailsProductSizeDTO(object);

            // Agregar la talla al color, si no existe ya
            if (!colorDTO.getProductSizes().contains(sizeDTO)) {
                colorDTO.getProductSizes().add(sizeDTO);
            }
        }

        return new ArrayList<>(productMap.values());
    }

    private static DetailsProductDTO createDetailsProductDTO(Object[] object) {
        return new DetailsProductDTO(
                object[0].toString(),                        // ID
                Float.parseFloat(object[1].toString()),      // Price
                object[2].toString(),                        // Description
                object[3].toString(),                        // Material
                object[4].toString(),                        // Gender
                object[5].toString(),                        // Season
                object[6].toString(),                        // Type
                new ArrayList<>()                            // Colors
        );
    }

    private static DetailsProductColorDTO getOrCreateDetailsColorDTO(String colorName, DetailsProductDTO productDTO) {
        // Buscar si ya existe un color con el mismo nombre
        return productDTO.getColors().stream()
                .filter(color -> color.getColorName().equals(colorName))
                .findFirst()
                .orElseGet(() -> {
                    // Si no existe, crearlo y agregarlo a la lista de colores
                    DetailsProductColorDTO newColor = createNewColorDTO(colorName);
                    productDTO.getColors().add(newColor);
                    return newColor;
                });
    }

    private static DetailsProductColorDTO createNewColorDTO(String colorName) {
        DetailsProductColorDTO colorDTO = new DetailsProductColorDTO();
        colorDTO.setColorName(colorName);
        colorDTO.setProductSizes(new ArrayList<>());  // new Array
        return colorDTO;
    }

    private static DetailsProductSizeDTO createDetailsProductSizeDTO(Object[] object) {
        return new DetailsProductSizeDTO(
                object[8].toString(),                      // Size
                Integer.parseInt(object[9].toString())      // Stock
        );
    }

}
