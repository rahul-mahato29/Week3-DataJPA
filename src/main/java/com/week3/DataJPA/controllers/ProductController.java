package com.week3.DataJPA.controllers;

import com.week3.DataJPA.Repositories.ProductRepository;
import com.week3.DataJPA.entities.ProductEntity;
import lombok.Builder;
import org.hibernate.event.spi.PreInsertEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private final int PAGE_SIZE = 5;

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @GetMapping
//    public List<ProductEntity> getAllProducts(){
//        return productRepository.findByOrderByPriceDesc();
//    }

//    @GetMapping
//    public List<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy){
//        return productRepository.findBy(Sort.by(Sort.Direction.ASC, sortBy));
//    }

//    @GetMapping
//    public List<ProductEntity> getAllProducts(){
//        return productRepository.findAll();
//    }

    @GetMapping
    public Page<ProductEntity> getAllProducts(
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "0") Integer pageNumber
    ){

        Pageable pageable = PageRequest.of(
                pageNumber,
                PAGE_SIZE,
                Sort.by(Sort.Direction.ASC, sortBy)
        );
        return productRepository.findAll(pageable);
    }
}
