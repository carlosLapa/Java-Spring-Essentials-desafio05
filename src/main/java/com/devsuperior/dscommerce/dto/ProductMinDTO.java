package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

public class ProductMinDTO {

    private Long id;
    private String name;
    private Double prices;
    private String imgUrl;

    public ProductMinDTO(Long id, String name, Double prices, String imgUrl) {
        this.id = id;
        this.name = name;
        this.prices = prices;
        this.imgUrl = imgUrl;
    }

    public ProductMinDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        prices = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrices() {
        return prices;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
