<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
 <head>
  <title>page</title>
 </head>
 <body>
  <c:if test="${session.username=='system'}">
欢迎系统管理员！
</c:if>
  

 </body>
</html>