package com.ecomz.util;

import com.ecomz.products.model.Product;
import com.ecomz.products.model.Category;

public class ProductsUtil {
	public void createCategory(String categoryId, String categoryName) {
		Category category = new Category(categoryId, categoryName);
	}

	public void createProduct(String productId, String productName, float price, String category) {
		Product product = new Product(productId, productName, price, category);
	}

	public Product getProductById(String productId) {
		// return product with ID from DB.
		return null;
	}

	public Product getProductByName(String productName) {
		// retrun Product with Name
		return null;
	}

}
