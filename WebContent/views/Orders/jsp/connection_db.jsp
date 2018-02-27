<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.ecomz.dal.OrdersDAL"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
OrdersDAL ordersdal = new OrdersDAL();
int check_insert = ordersdal.insertRow("insert into order_master values(1003,'31-12-18',3,2500,'Net Banking') ");

out.println(check_insert); 
check_insert = ordersdal.insertRow("select * from order_master");
out.println(check_insert);%>
</body>
</html>