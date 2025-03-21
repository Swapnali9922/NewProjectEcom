package com.example.productservice.dtos;

import com.example.productservice.model.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class GenericProductDto {
    private String title;

    private String description;
    private double price;
    private String image;
    private String category;
}
