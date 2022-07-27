package com.ecommerce.supekart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SK_CUSTOMER")
public class Customer {
	@Id
	@Column(name = "EMAIL_ID")
	private String emailId;
	private String name;
	private String password;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_EMAIL_ID")
	private List<CustomerAddress> address;

	@JoinColumn(name = "CUSTOMER_EMAIL_ID")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Cart> customerCarts;

	@JoinColumn(name = "CUSTOMER_EMAIL_ID")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> orders;

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

	public List<CustomerAddress> getAddress() {
		return address;
	}

	public void setAddress(List<CustomerAddress> address) {
		this.address = address;
	}

	public List<Cart> getCustomerCarts() {
		return customerCarts;
	}

	public void setCustomerCarts(List<Cart> customerCarts) {
		this.customerCarts = customerCarts;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
