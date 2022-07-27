package com.ecommerce.supekart.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;


@Entity
@Table(name = "SK_RECOMMENDED_PRODUCT")
public class RecommendedProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECOMMENDED_ID")
	private Integer recommendedId;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	private LocalDateTime recommendedIdTimestamp;
	private String recommendedStatus;
	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name = "SELLER_EMAIL_ID")
	private Seller seller;

	public Integer getRecommendedId() {
		return recommendedId;
	}

	public void setRecommendedId(Integer recommendedId) {
		this.recommendedId = recommendedId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	public LocalDateTime getRecommendedIdTimestamp() {
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
	
	public String getSellerEmailId() {
		return sellerEmailId;
	}
	
	public void setSellerEmailId(String sellerEmailId) {
		this.sellerEmailId = sellerEmailId;
	}

}