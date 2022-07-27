package com.ecommerce.supekart.service;

import com.ecommerce.supekart.dto.CustomerDTO;
import com.ecommerce.supekart.entity.Customer;
import com.ecommerce.supekart.exception.SuperkartException;
import com.ecommerce.supekart.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void addCustomer(CustomerDTO customerDTO) throws SuperkartException {
        Optional<Customer> opt = customerRepository.findById(customerDTO.getEmailId());
        if (opt.isPresent())
            throw new SuperkartException("Customer already have an account");
        Customer customer = CustomerDTO.convertDTOtoEntity(customerDTO);
        customerRepository.save(customer);
    }
    @Override
    public void updateCustomer(CustomerDTO customerDTO) throws SuperkartException {
        Optional<Customer> opt = customerRepository.findById(customerDTO.getEmailId());
        if(opt.isEmpty())
            throw new SuperkartException("Customer not found");
        Customer customer = CustomerDTO.convertDTOtoEntity(customerDTO);
        customerRepository.save(customer);
    }

    @Override
    public CustomerDTO getCustomerByEmailId(String emailId) throws SuperkartException {
        Optional<Customer> opt = customerRepository.findById(emailId);
        Customer customer  = opt.orElseThrow(()-> new SuperkartException("Customer not found"));
        return CustomerDTO.convertEntitytoDTO(customer);
    }

    @Override
    public Boolean authenticateCustomer(CustomerDTO customerDTO) throws SuperkartException {
        Optional<Customer> opt = customerRepository.findById(customerDTO.getEmailId());
        Customer customer = opt.orElseThrow(() -> new SuperkartException("Customer does not exist"));
        return customerDTO.getPassword().equals(customer.getPassword());
    }
}
