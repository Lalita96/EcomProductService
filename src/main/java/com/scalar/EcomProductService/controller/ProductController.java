package com.scalar.EcomProductService.controller;

import com.scalar.EcomProductService.dto.ProductListResponseDTO;
import com.scalar.EcomProductService.dto.ProductRequestDTO;
import com.scalar.EcomProductService.dto.ProductResponseDTO;

import com.scalar.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    @Qualifier("fakeStoreProductService")
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity getAllProducts()
    {
//        ProductResponseDTO p1 = new ProductResponseDTO();
//        p1.setId(1);
//        p1.setCategory("Electronics");
//        p1.setTitle("Iphone 15 Pro");
//        p1.setPrice(150000);
//        p1.setImage("www.google.com/images/iphone");
//        p1.setDescription("Kafi Mehnga Phone");
//
//        ProductResponseDTO p2 = new ProductResponseDTO();
//        p2.setId(2);
//        p2.setCategory("Electronics");
//        p2.setTitle("Macbook Pro");
//        p2.setPrice(250000);
//        p2.setImage("www.google.com/images/macbook");
//        p2.setDescription("Kafi Mehnga macbook");
//
//        List<ProductResponseDTO> products = Arrays.asList(p1,p2);
//        return ResponseEntity.ok(products);
        ProductListResponseDTO response = productService.getAllProducts();
    return ResponseEntity.ok(response);
    }

    @GetMapping("/products/1")
    public ResponseEntity getProductFromId()
    {
//        ProductResponseDTO p1 = new ProductResponseDTO();
//        p1.setId(1);
//        p1.setCategory("Electronics");
//        p1.setTitle("Iphone 15 Pro");
//        p1.setPrice(150000);
//        p1.setImage("www.google.com/images/iphone");
//        p1.setDescription("Kafi Mehnga Phone");
//
//        ProductResponseDTO p2 = new ProductResponseDTO();
//        p2.setId(2);
//        p2.setCategory("Electronics");
//        p2.setTitle("Macbook Pro");
//        p2.setPrice(250000);
//        p2.setImage("www.google.com/images/macbook");
//        p2.setDescription("Kafi Mehnga macbook");
//        List<ProductResponseDTO> products = Arrays.asList(p1,p2);
//        return ResponseEntity.ok(products);
        ProductResponseDTO response = productService.getProductById(1);
        return ResponseEntity.ok(response);
    }
}
