package com.example.productservice.services;

import com.example.productservice.dtos.FakeStoreProductDto;
import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class fakestoreProductService implements ProductService {
    private RestTemplateBuilder restTemplateBuilder;
    private String getProductRequesturl = "https://fakestoreapi.com/products/{id}";

    public fakestoreProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public GenericProductDto getProductById(int id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity(getProductRequesturl, FakeStoreProductDto.class, id);
        FakeStoreProductDto fakestoreproductdto=response.getBody();
        GenericProductDto product=new GenericProductDto();

        product.setTitle(fakestoreproductdto.getTitle());
        product.setDescription(fakestoreproductdto.getDescription());
        product.setPrice(fakestoreproductdto.getPrice());
        product.setImage(fakestoreproductdto.getImage());
        product.setCategory(fakestoreproductdto.getCategory());
        return product;


    }
}

