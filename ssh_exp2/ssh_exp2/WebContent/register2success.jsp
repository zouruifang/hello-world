<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>校验成功</title>	
    </head>
    <body>
        校验通过，用户信息如下：
        <hr>
        姓名：<s:property value="userName"/>
        <br>
        密码：<s:property value="userPassword"/>
        <br>
        年龄：<s:property value="userAge"/>
        <br>
        电话：<s:property value="userTelephone"/>
		<br>
        邮箱：<s:property value="userEmail"/>
    </body>
</html>
