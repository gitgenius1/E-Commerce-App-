package com.ecommerce.supekart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.supekart.entity.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
