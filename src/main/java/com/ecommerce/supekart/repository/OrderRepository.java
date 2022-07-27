package com.ecommerce.supekart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.supekart.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
