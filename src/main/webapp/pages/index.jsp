<%--
  Created by IntelliJ IDEA.
  User: adminx
  Date: 11.05.2018
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello</h2>

<form action="/saveUserWithAvatarAndSendEmail" method="post" enctype="multipart/form-data">
    <label for="email">email</label>
    <input id="email" type="email" name="email" placeholder="email">
    <label for="file">avatar</label>
    <input id="file" type="file" name="file" placeholder="">
    <input type="submit" name="" placeholder="">
</form>
</body>
</html>
