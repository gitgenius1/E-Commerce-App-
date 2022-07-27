package com.ecommerce.supekart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.supekart.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
