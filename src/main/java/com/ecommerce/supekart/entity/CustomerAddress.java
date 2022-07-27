package com.ecommerce.supekart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SK_CUSTOMER_ADDRESS")
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String contactNumber;
	private String line1;
	private String line2;
	private String state;
	private String city;
	private String pin;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

//	public String getCustomerEmailId() {
//		return customerEmailId;
//	}
//
//	public void setCustomerEmailId(String customerEmailId) {
//		this.customerEmailId = customerEmailId;
//	}
//
//	public String getSellerEmailId() {
//		return sellerEmailId;
//	}
//
//	public void setSellerEmailId(String sellerEmailId) {
//		this.sellerEmailId = sellerEmailId;
//	}

}
