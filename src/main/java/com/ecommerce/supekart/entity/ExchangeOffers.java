package com.ecommerce.supekart.entity;

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
@Table(name = "EXCHANGE_OFFERS")
public class ExchangeOffers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer offerId;
	@OneToOne(cascade =CascadeType.DETACH)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	private Float offerDiscount;
	@OneToMany(cascade =CascadeType.DETACH)
	@JoinColumn(name = "SELLER_ID")
	private Seller seller;

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Float getOfferDiscount() {
		return offerDiscount;
	}

	public void setOfferDiscount(Float offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
