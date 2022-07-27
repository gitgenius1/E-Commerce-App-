package com.ecommerce.supekart.dto;

import java.time.LocalDateTime;

public class OrderDTO {
	private Integer orderId;
	private Integer orderNumber;
	private LocalDateTime dateOfOrder;
	private ProductDTO product;
	private Integer quantity;
	private Float totalPrice;
	private Integer addressId;
	private OrderStatus orderStatus;
	private PaymentThrough paymentThrough;
	private LocalDateTime dateOfDelivery;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDateTime getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(LocalDateTime dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public PaymentThrough getPaymentThrough() {
		return paymentThrough;
	}

	public void setPaymentThrough(PaymentThrough paymentThrough) {
		this.paymentThrough = paymentThrough;
	}

	public LocalDateTime getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(LocalDateTime dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

}