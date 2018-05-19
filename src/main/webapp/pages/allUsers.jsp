<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adminx
  Date: 14.05.2018
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    <div>
        <h3>${user.id} ${user.email}</h3>
        <img src="${user.avatar}" alt="">
    </div>
</c:forEach>

</body>
</html>
