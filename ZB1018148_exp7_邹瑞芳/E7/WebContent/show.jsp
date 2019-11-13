<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");%>
<!-- 三角形的面积是：<%=session.getAttribute("msg") %> -->
	 
	边1是：${side1}<br/>
	边2是：${side2}<br/>
	边3是：${side3}<br/>  
	三角形的面积是：<font color="green">${msg}</font>
	
</body>
</html>