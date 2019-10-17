<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<%
int num=Integer.parseInt(request.getParameter("num"));
for(int i=1;i<=num;i++){
	for(int j=1;j<=i;j++){
		out.print(i+"*"+j+"="+i*j+"    ");
	}
	out.print("<br>");
}
%>
</body>
</html>