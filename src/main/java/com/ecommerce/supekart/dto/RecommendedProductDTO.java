package com.ecommerce.supekart.dto;

import java.time.LocalDateTime;


public class RecommendedProductDTO {
	private Integer recommendedId;
	private ProductDTO product;
	private LocalDateTime recommendedIdTimestamp;
	private String recommendedStatus;
	private String sellerEmailId;

	public Integer getRecommendedId() {
		return recommendedId;
	}

	public void setRecommendedId(Integer recommendedId) {
		this.recommendedId = recommendedId;
	}

	public ProductDTO getProduct() {
		return product;
	}
 
	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public String geRecommendedIdTimestamp() {
		return recommendedIdTimestamp;
	}

	public void setRecommendedIdTimestamp(LocalDateTime recommendedIdTimestamp) {
		this.recommendedIdTimestamp = recommendedIdTimestamp;
	}

	public String getRecommendedStatus() {
		return recommendedStatus;
	}

	public void setRecommendedStatus(String recommendedStatus) {
		this.recommendedStatus = recommendedStatus;
	}

	public LocalDateTime getSellerEmailId() {
		return sellerEmailId;
	}

	public void setSellerEmailId(String sellerEmailId) {
		this.sellerEmailId = sellerEmailId;
	}

}
