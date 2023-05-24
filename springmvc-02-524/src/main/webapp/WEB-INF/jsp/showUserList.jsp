<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zyx
  Date: 2023/5/24
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  用户数据：
  <c:forEach items="${userList}" var="user">
    ${user.id} -- ${user.name} --- ${user.email} <br>
  </c:forEach>
</body>
</html>
