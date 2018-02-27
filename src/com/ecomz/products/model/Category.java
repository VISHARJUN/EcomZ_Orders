package com.ecomz.products.model;

public class Category {
	String categoryId;
	String categoryName;
	
	public Category(String categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryId=" + categoryId + "]";
	}
	

}
