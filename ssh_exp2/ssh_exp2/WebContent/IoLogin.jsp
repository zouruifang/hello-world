<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">   
    <title>用户登录</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style type="text/css">
  a{text-decoration: none;}
  </style>
  </head> 
  <body>
    <center>
    	<s:form action="IoCAction" method="post" name="loginForm">
    		<s:textfield name="username" label="用户名"></s:textfield>
    		<s:password name="password" label="密码"></s:password>
    		<s:submit value="登录"></s:submit>
    		<s:a href="register.jsp">注册</s:a> 
    	</s:form>
    </center>
  </body>
</html>
