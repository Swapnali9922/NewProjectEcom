package com.example.productservice.services;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {


  GenericProductDto getProductById(int id);
}
