package com.ecommerce.supekart.dto;

public class ExchangeOffersDTO {
	private Integer offerId;;
	private ProductDTO product;
	private Float offerDiscount;
	private SellerDTO seller;
	
	public Integer getOfferId() {
		return cardId;
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
		return dealDiscount;
	}

	public void setOfferDiscount(Float offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

	public Seller getSeller() {
		return dealStartsAt;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}

