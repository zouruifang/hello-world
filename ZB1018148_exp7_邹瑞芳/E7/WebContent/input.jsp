<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
    <%@page import="com.cslg.cn.triangleServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  request.setCharacterEncoding("UTF-8");
%>
    <form action="triangleServlet" method="post">
        <p>输入三条边的值：</p>
                  <p>边1：<input type="text" name="side1"/></p>
                  <p>边2：<input type="text" name="side2"/></p>
                  <p>边3：<input type="text" name="side3"/></p>
              <input type="submit" value="计算面积"/>
    </form>
</body>
</html>