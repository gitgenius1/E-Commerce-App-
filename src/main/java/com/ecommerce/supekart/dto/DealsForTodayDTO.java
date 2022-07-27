package com.ecommerce.supekart.dto;

public class DealsForTodayDTO {
	private Integer dealId;;
	private ProductDTO product;
	private Float dealDiscount;
	private LocalDateTime dealStartsAt;
	private LocalDateTime dealEndsAt;
	private SellerDTO seller;
	
	public Integer getDealId() {
		return dealId;
	}

	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Float getDealDiscount() {
		return dealDiscount;
	}

	public void setDealDiscount(Float dealDiscount) {
		this.dealDiscount = dealDiscount;
	}

	public LocalDateTime getDealStartsAt() {
		return dealStartsAt;
	}

	public void setDealStartsAt(LocalDateTime dealStartsAt) {
		this.dealStartsAt = dealStartsAt;
	}

	public LocalDateTime getDealEndsAt() {
		return dealEndsAt;
	}

	public void setDealEndsAt(LocalDateTime dealEndsAt) {
		this.dealEndsAt = dealEndsAt;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
