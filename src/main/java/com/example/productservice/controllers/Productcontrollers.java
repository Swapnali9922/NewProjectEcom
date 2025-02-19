package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/")
public class Productcontrollers {

    @GetMapping
    public void getAllProduct(){

    }
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") int id){
                return "here is ur product"+id;
    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

    @PostMapping
    public String createProduct(){
          return "here is a product";
    }

    @PutMapping
    public void updateProduct(){

    }


}
