package com.ecommerce.supekart.dto;

import com.ecommerce.supekart.entity.Product;

public class ProductDTO {
    private Integer productId;
    private String name;
    private String description;
    private String category;
    private String brand;
    private Double price;
    private Double discount;
    private Integer quantity;
    private String sellerEmailId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSellerEmailId() {
        return sellerEmailId;
    }

    public void setSellerEmailId(String sellerEmailId) {
        this.sellerEmailId = sellerEmailId;
    }

    public static ProductDTO convertEntityToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId(product.getProductId());
        productDTO.setPrice(product.getPrice());
        productDTO.setBrand(product.getBrand());
        productDTO.setDescription(product.getDescription());
        productDTO.setCategory(product.getCategory());
        productDTO.setQuantity(product.getQuantity());
        productDTO.setName(product.getName());
        productDTO.setSellerEmailId(product.getSellerEmailId());
        return productDTO;
    }

	public static Product convertDTOToEntity(ProductDTO productDTO) {
		Product product = new Product();
		product.setProductId(productDTO.getProductId());
		product.setPrice(productDTO.getPrice());
		product.setBrand(productDTO.getBrand());
		product.setDescription(productDTO.getDescription());
		product.setCategory(productDTO.getCategory());
		product.setQuantity(productDTO.getQuantity());
		product.setName(productDTO.getName());
		product.setSellerEmailId(productDTO.getSellerEmailId());
		return product;
	}
}