package com.ecommerce.supekart.dto;

import com.ecommerce.supekart.entity.ProductCategory;

public class ProductCategoryDTO {

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static ProductCategoryDTO convertEntityToDTO(ProductCategory productCategory){
		ProductCategoryDTO productCategoryDTO = new ProductCategoryDTO();
		productCategoryDTO.setCategory(productCategory.getCategory());
		return productCategoryDTO;
	}


}
