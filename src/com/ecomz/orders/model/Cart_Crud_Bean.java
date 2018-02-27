package com.ecomz.orders.model;

import java.util.ArrayList;

public class Cart_Crud_Bean {
	private ArrayList cartItems = new ArrayList();
	private double orderTotal;

	public ArrayList getCartItems() {
		return cartItems;
	}

	public void setCartItems(ArrayList cartItems) {
		this.cartItems = cartItems;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int ItemsCount() {
		return cartItems.size();
	}

	protected void CalcualteOrderTotal() {
		double total = 0;
		for (int count = 0; count < cartItems.size(); count++) {
			Cart_item_Bean cartItemBean = (Cart_item_Bean) cartItems.get(count);
			total += cartItemBean.getTotalCost();
		}
		setOrderTotal(total);

	}

	public void deleteCartItem(String itemIndex) {
		try {
			int ItemIndex = Integer.parseInt(itemIndex);
			cartItems.remove(ItemIndex - 1);
			CalcualteOrderTotal();
		} catch (Exception exception) {
			System.out.println("Item Can't be removed due to the Error : " + exception.getMessage());
			exception.printStackTrace();
		}
	}

	public void updateCartItem(String strItemIndex, String strQuantity) {
		double totalCost = 0.0;
		double unitCost = 0.0;
		int quantity = 0;
		int ItemIndex = 0;
		Cart_item_Bean cartItem = null;
		try {
			ItemIndex = Integer.parseInt(strItemIndex);
			quantity = Integer.parseInt(strQuantity);
			if (quantity > 0) {
				cartItem = (Cart_item_Bean) cartItems.get(ItemIndex - 1);
				unitCost = cartItem.getUnitCost();
				totalCost = unitCost * quantity;
				cartItem.setQuantity(quantity);
				cartItem.setTotalCost(totalCost);
				CalcualteOrderTotal();
			}
		} catch (Exception exception) {
			System.out.println("Item Can't be updated due to the Error : " + exception.getMessage());
			exception.printStackTrace();
		}
	}

}
