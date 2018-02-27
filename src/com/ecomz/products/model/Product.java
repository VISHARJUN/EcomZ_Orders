package com.ecomz.products.model;

import java.util.Scanner;

public class Product {
	String productId;
	String productName;
	Float price;
	String categoryId;
	public Product(String productId,String productName,float price,String category )
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.categoryId=category;
	}

	public void getDetails() {
		System.out.println("ProductId : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Price : "+price);
		System.out.println("Category : "+categoryId);

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", category="
				+ categoryId + "]";
	}
	
}


