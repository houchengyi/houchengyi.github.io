<%--
  Created by IntelliJ IDEA.
  User: houhouexe
  Date: 2022/7/21
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
   < !--因为jsp可以直接访问 不需要在控制器中写请求处理 因为web配置文件默认会找index.html index,index.jsp -->
     <a href="${pageContext.request.contextPath}/success">访问index</a>
</body>
</html>
