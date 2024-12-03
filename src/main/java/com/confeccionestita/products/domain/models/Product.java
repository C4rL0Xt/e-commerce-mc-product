package com.confeccionestita.products.domain.models;

import java.util.List;

// ? Domain Entity
public class Product {

    private ProductoId product_id; // * VO
    private String description;
    private Float price;
    private Season season; //* VO
    private Material material; // * VO
    private Gender gender; // * VO
    private SpecificType specificType; // * Entity Relation
    private List<ProductColor> colors; // * VO

    public Product(ProductoId product_id, String description, Float price, Season season, List<ProductColor> colors, Material material, Gender gender, SpecificType specificType) {
        this.product_id = product_id;
        this.description = description;
        this.price = price;
        this.season = season;
        this.material = material;
        this.gender = gender;
        this.specificType = specificType;
        this.colors = colors;
    }

    // * * this method is used to update the product, not updated the product_id, gender and specificType
    public void updateProduct(String description, Float price, Season season, Material material) {
        this.description = description;
        this.price = price;
        this.season = season;
        this.material = material;
    }

    //  * * this method is used to add a new color to the product
    public void addProductColor(ProductColor productColor){
        this.colors.add(productColor);
    }

    public ProductColor findColor(String color){
       ProductColor found = this.colors.stream().filter(c -> c.getColor().equals(color)).findFirst().orElse(null);
       if (found == null) {
           throw new NullPointerException("El producto con este color {"+color+"} no existe");
       } else {
           return found;
       }
    }

    public ProductoId getProduct_id() {
        return product_id;
    }

    public void setProduct_id(ProductoId product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public SpecificType getSpecificType() {
        return specificType;
    }

    public void setSpecificType(SpecificType specificType) {
        this.specificType = specificType;
    }

    public List<ProductColor> getColors() {
        return colors;
    }

    public void setColors(List<ProductColor> colors) {
        this.colors = colors;
    }


}
