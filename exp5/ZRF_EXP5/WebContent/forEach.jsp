<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
 <head>
  <title>page</title>
 </head>
 <body>
  <%
   String names[] = new String[4];
   names[0] = "孙悟空";
   names[1] = "猪八戒";
   names[2] = "沙僧";
   names[3] = "唐僧";
   pageContext.setAttribute("names", names);
  %>
  <c:forEach items="${names}" var="name">
  ${name}<br>
 </c:forEach>
 
 <c:forEach items="${names}" var="name" begin="0" end="3" step="1"> 
  ${name}<br>
 </c:forEach>

 <c:forEach items="${names}" var="name" varStatus="i"> 
 ${name}<br>
 index: ${i.index}<br>
 count: ${i.count}<br>
 first: ${i.first}<br>
 last: ${i.last}<br>
</c:forEach> 
 </body>
</html>