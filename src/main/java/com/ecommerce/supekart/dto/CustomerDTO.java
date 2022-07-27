package com.ecommerce.supekart.dto;

import com.ecommerce.supekart.entity.Customer;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDTO {
    @NotNull
    private String emailId;
    private String name;
    @NotNull
    private String password;
    @Pattern(regexp = "[0-9]{10}")
    private String phoneNumber;

    private List<CustomerAddressDTO> address;

    private List<CartDTO> customerCarts;

    private List<OrderDTO> orders;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<CustomerAddressDTO> getAddress() {
        return address;
    }

    public void setAddress(List<CustomerAddressDTO> address) {
        this.address = address;
    }

    public List<CartDTO> getCustomerCarts() {
        return customerCarts;
    }

    public void setCustomerCarts(List<CartDTO> customerCarts) {
        this.customerCarts = customerCarts;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }

    public static Customer convertDTOtoEntity(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setPhoneNumber(customerDTO.getPhoneNumber());
		customer.setEmailId(customerDTO.getEmailId());
		customer.setName(customerDTO.getName());
		customer.setPassword(customerDTO.getPassword());
		return customer;
    }

	public static CustomerDTO convertEntitytoDTO(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setPhoneNumber(customer.getPhoneNumber());
		customerDTO.setEmailId(customer.getEmailId());
		customerDTO.setName(customer.getName());
		customerDTO.setPassword(customer.getPassword());
		return customerDTO;
	}
}
