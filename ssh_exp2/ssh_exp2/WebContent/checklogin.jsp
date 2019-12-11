<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="checkAction" method="post" >
    		<s:textfield name="username" key="loginName" label="用户名"></s:textfield>
    		<s:password name="password" key="loginPassword" label="密码"></s:password>
    		<s:submit value="登录" key="loginSubmit"></s:submit>
    		 
    	</s:form>
</body>
</html>