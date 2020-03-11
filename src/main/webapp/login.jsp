<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/10
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>

</head>
<body>
    <form action="${pageContext.request.contextPath}/login.do" method="post">
        <p>用户名：<input type="text" name="name"></p>
        <p>密码：<input type="password" name="password"></p>
        <p><button type="submit">登录</button></p>
    </form>
</body>
</html>
