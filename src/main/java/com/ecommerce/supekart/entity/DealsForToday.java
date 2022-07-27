package com.ecommerce.supekart.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "DEALS_FOR_TODAY")
public class DealsForToday {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dealId;
	@OneToOne(cascade =CascadeType.DETACH)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	private Float dealDiscount;
	private LocalDateTime dealStartsAt;
	private LocalDateTime dealEndsAt;
	@OneToMany(cascade =CascadeType.DETACH)
	@JoinColumn(name = "SELLER_ID")
	private Seller seller;

	public Integer getDealId() {
		return dealId;
	}

	public void setDealId(Integer dealId) {
		this.dealId = dealId;
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

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
