package com.confeccionestita.products.domain.services;

import com.confeccionestita.products.domain.exceptions.ColorNotFoundException;
import com.confeccionestita.products.domain.exceptions.SizeNotFoundException;
import com.confeccionestita.products.domain.models.Product;
import com.confeccionestita.products.domain.models.ProductColor;
import com.confeccionestita.products.domain.models.Size;
import com.confeccionestita.products.domain.models.StockSize;

// * * Domain Service to manage the inventory
public class InventoryService {

    public void reduceStock(Product product, int quantity, String color, Size size) {
        StockSize productStock = getProductStock(product, quantity, color, size);
        productStock.reduceStock(quantity);
    }

    public void increaseStock(Product product, int quantity, String color, Size size) {
        StockSize productStock = getProductStock(product, quantity, color, size);
        productStock.increaseStock(quantity);
    }

    private StockSize getProductStock(Product product, int quantity, String color, Size size) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }

        ProductColor productColor = product.findColor(color);
        if (productColor == null) {
            throw new ColorNotFoundException(color);
        }

        StockSize stockSize = productColor.findSize(size);
        if (stockSize == null) {
            throw new SizeNotFoundException(size.getSize());
        }

        return stockSize;
    }

}
