package com.ecommerce.supekart.controller;

import com.ecommerce.supekart.dto.ProductCategoryDTO;
import com.ecommerce.supekart.dto.ProductDTO;
import com.ecommerce.supekart.exception.SuperkartException;
import com.ecommerce.supekart.service.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;

    private static final Log LOGGER = LogFactory.getLog(ProductController.class);

    @PostMapping(value = "product")
    public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO){
        productService.addProduct(productDTO);
        return new ResponseEntity<>("Product Added", HttpStatus.CREATED);
    }

    @GetMapping(value = "product/categories")
    public ResponseEntity<List<ProductCategoryDTO>> getProductCategories() throws SuperkartException {
        return new ResponseEntity<>(productService.getProductCategories(), HttpStatus.OK);
    }

    @GetMapping(value = "product")
    public ResponseEntity<List<ProductDTO>> getProducts() throws SuperkartException {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }


}
