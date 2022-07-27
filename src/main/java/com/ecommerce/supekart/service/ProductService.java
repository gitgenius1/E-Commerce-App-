package com.ecommerce.supekart.service;

import com.ecommerce.supekart.dto.ProductCategoryDTO;
import com.ecommerce.supekart.dto.ProductDTO;
import com.ecommerce.supekart.exception.SuperkartException;

import java.util.List;

public interface ProductService {

    void addProduct(ProductDTO productDTO) ;

    List<ProductCategoryDTO> getProductCategories() throws SuperkartException;

    List<ProductDTO> getProducts() throws SuperkartException;
}
