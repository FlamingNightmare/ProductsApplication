package com.products.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Integer quantity;
    private Float price;
    private Category category;
    private IngredientDTO[] ingredientDTOs;
}
