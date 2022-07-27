package com.ecommerce.supekart.entity;

import javax.persistence.Table;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "SK_CUSTOMER_WISHLIST")
public class WishList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer wishlistId;
	@OneToOne(Cascade = CascadeType.DETACH)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	private LocalDateTime productAddedDate;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "CUSTOMER_EMAIL_ID")
	private Customer customer;

	public Integer getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Integer getProductId() {
		return product;
	}

	public void setProductId(Product product) {
		this.product = product;
	}

	public LocalDateTime getProductAddedDate() {
		return productAddedDate;
	}

	public void setProductAddedDate(LocalDateTime productAddedDate) {
		this.productAddedDate = productAddedDate;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
