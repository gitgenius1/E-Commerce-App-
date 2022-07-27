package com.ecommerce.supekart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

@Entity
@Table(name = "PRODUCT_FEEDBACK")
public class ProductFeedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feedbackId;
	@OneToMany(cascade = CasacadeType.DETACH)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	@OneToOne(cascade = CasacadeType.DETACH)
	@JoinColumn(name = "CUSTOMER_EMAIL_ID")
	private Customer customer;
	private String productReview;
	private Integer upvote;
	private Integer downvote;

	public Integer getFeedbackId() {
		return cardId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		return product;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getProductReview() {
		return productReview;
	}
	
	public void setProductReview(String productReview) {
		this.productReview = productReview;
	}

	public Integer getUpvote() {
		return upvote;
	}

	public void setUpvote(Integer upvote) {
		this.upvote = upvote;
	}
	
	public Integer getDownvote() {
		return downvote;
	}

	public void setDownvote(Integer downvote) {
		this.downvote = downvote;
	}

}
