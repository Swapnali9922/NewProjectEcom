package com.example.productservice.controllers;

import com.example.productservice.dtos.GenericProductDto;
import com.example.productservice.model.Product;
import com.example.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/")
public class Productcontrollers {

    private ProductService productservice;

    public Productcontrollers(ProductService productservice) {

        this.productservice=productservice;
    }

    @GetMapping
    public void getAllProduct(){

    }
    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") int id){
                 return productservice.getProductById(id);
    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

    @PostMapping
    public String createProduct(){
          return "fdffvdddgbbbbbbbbbbbbbb";
    }

    @PutMapping
    public void updateProduct(){

    }


}
