package com.ecomz.offers.model;

public class Deal {
	public String productId;
	public int discountPrice;
	public String startDate;
	public String endDate;
	
	public void getDetails() {
		//sysout all the values.
	}

	@Override
	public String toString() {
		return "Deal [productId=" + productId + ", discountPrice=" + discountPrice + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
}
