package com.ecommerce.supekart.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.supekart.entity.CustomerAddress;

public interface CustomerAddressRepository extends CrudRepository<CustomerAddress, String> {

}
