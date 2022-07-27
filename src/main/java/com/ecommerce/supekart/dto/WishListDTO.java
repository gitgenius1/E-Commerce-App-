package com.ecommerce.supekart.dto;

import java.time.LocalDateTime;

public class WishListDTO {
	private Integer wishlistId;
	private Integer productId;
	private LocalDateTime productAddedDate;
	private String customerEmailId;

	public Integer getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public LocalDateTime getProductAddedDate() {
		return productAddedDate;
	}

	public void setProductAddedDate(LocalDateTime productAddedDate) {
		this.productAddedDate = productAddedDate;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

}
