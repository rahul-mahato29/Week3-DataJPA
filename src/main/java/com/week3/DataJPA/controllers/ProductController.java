package com.week3.DataJPA.controllers;

import com.week3.DataJPA.Repositories.ProductRepository;
import com.week3.DataJPA.entities.ProductEntity;
import lombok.Builder;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @GetMapping
//    public List<ProductEntity> getAllProducts(){
//        return productRepository.findByOrderByPriceDesc();
//    }

    @GetMapping
    public List<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy){
        return productRepository.findBy(Sort.by(Sort.Direction.ASC, sortBy));
    }
}
