<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Product List</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
	<p>
		<font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Products List</strong></font>
	</p>
	<a href="ShoppingCart.jsp" >View Cart</a>
	<p />
	<table width="75%" border="1">
		<tr>
			<td><form name="ProductDetail1" method="POST"
					action="servlet/CartController">
					<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Product:</strong>
						Product1</font><input type="hidden" name="productId" value="Product 1">
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Description:</strong>
							e-ShopZZ Imaginary Product 1. </font><input type="hidden"
							name="productDescription" value="e-ShopZZ Imaginary Product 1.">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Quantity:<input
								type="text" size="2" value="1" name="quantity"></strong></font>
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Price:</strong>
							10.00 INR</font><input type="hidden" name="unitCost" value="10">
					</p>
					<input type="hidden" name="action" value="add"><input
						type="submit" name="addToCart" value="Add To Cart">
				</form></td>
			<td><form name="ProductDetail2" method="POST"
					action="servlet/CartController">
					<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Product</strong>:
						Product2 </font><input type="hidden" name="productId" value="Product2">
					<font face="Verdana, Arial, Helvetica, sans-serif">
						<p>
							<font size="2"><strong>Description</strong>: e-ShopZZ Imaginary Product 2. </font><input type="hidden" name="productDescription"
								value="e-ShopZZ Imaginary Product 2.">
						</p>
						<p>
							<font size="2"><strong>Quantity</strong>: <input
								type="text" size="2" value="1" name="quantity"></font>
						</p>
						<p>
							<font size="2"><strong>Price</strong>: 20.00 INR<input
								type="hidden" name="unitCost" value="20"></font>
						</p> <input type="hidden" name="action" value="add"> <input
						type="submit" name="addToCart" value="Add To Cart">
					</font>
				</form></td>
		</tr>
		<tr>
			<td><form name="ProductDetail3" method="POST"
					action="servlet/CartController">
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Product:</strong>
							Product3</font><input type="hidden" name="productId" value="Product 3">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Description:</strong>
							e-ShopZZ Imaginary Product 3. </font><input type="hidden"
							name="productDescription" value="e-ShopZZ Imaginary Product 3.">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Quantity:</strong></font>
						<input type="text" size="2" value="1" name="quantity">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Price:
								30.00 INR</strong></font><input type="hidden" name="unitCost" value="30">
					</p>
					<input type="hidden" name="action" value="add"> <input
						type="submit" name="addToCart" value="Add To Cart">
				</form></td>
			<td><form name="ProductDetail4" method="POST"
					action="servlet/CartController">
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Product</strong>:
							Product4</font><input type="hidden" name="productId" value="Product4">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Description</strong>:
							e-ShopZZ Imaginary Product 4. </font><input type="hidden"
							name="productDescription" value="e-ShopZZ Imaginary Product 4.">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Quantity</strong>:</font>
						<input type="text" size="2" value="1" name="quantity">
					</p>
					<p>
						<font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Price</strong>:
							40.00 INR</font><input type="hidden" name="unitCost" value="40">
					</p>
					<input type="hidden" name="action" value="add"><input
						type="submit" name="addToCart" value="Add To Cart">
				</form></td>
		</tr>
	</table>
	<p></p>
</body>
</html>