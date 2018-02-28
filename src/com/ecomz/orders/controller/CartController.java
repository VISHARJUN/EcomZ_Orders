package com.ecomz.orders.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecomz.orders.model.Cart_Crud_Bean;

public class CartController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String action = request.getParameter("action");

			if (action != null && !action.equals("")) {
				if (action.equals("add")) {
					addToCart(request);
				} else if (action.equals("Update")) {
					updateCart(request);
				} else if (action.equals("Delete")) {
					deleteCart(request);
				}
			}
			response.sendRedirect("../ShoppingCart.jsp");
		} catch (Exception exception) {
			PrintWriter out = response.getWriter();
			out.println("Exception Occured at CartController: doPost Method " + exception);
			exception.printStackTrace();
		}

	}

	protected void deleteCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String itemIndex = request.getParameter("itemIndex");
		Cart_Crud_Bean cartBean = null;

		Object objCartBean = session.getAttribute("cart");
		if (objCartBean != null) {
			cartBean = (Cart_Crud_Bean) objCartBean;
		} else {
			cartBean = new Cart_Crud_Bean();
		}
		cartBean.deleteCartItem(itemIndex);
	}

	protected void updateCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String quantity = request.getParameter("quantity");
		String itemIndex = request.getParameter("itemIndex");

		Cart_Crud_Bean cartBean = null;

		Object objCartBean = session.getAttribute("cart");
		if (objCartBean != null) {
			cartBean = (Cart_Crud_Bean) objCartBean;
		} else {
			cartBean = new Cart_Crud_Bean();
		}
		cartBean.updateCartItem(itemIndex, quantity);
	}

	protected void addToCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String modelNo = request.getParameter("productId");
		String description = request.getParameter("productDescription");
		String price = request.getParameter("unitCost");
		String quantity = request.getParameter("quantity");

		Cart_Crud_Bean cartBean = null;

		Object objCartBean = session.getAttribute("cart");

		if (objCartBean != null) {
			cartBean = (Cart_Crud_Bean) objCartBean;
		} else {
			cartBean = new Cart_Crud_Bean();
			session.setAttribute("cart", cartBean);
		}

		cartBean.addCartItem(modelNo, description, price, quantity);
	}

}