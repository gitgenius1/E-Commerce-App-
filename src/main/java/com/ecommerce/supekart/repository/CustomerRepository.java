package com.ecommerce.supekart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.supekart.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
