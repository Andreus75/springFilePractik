<%--
  Created by IntelliJ IDEA.
  User: adminx
  Date: 16.05.2018
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<body>
<h2>RESTfull</h2>

<button id="x"></button>
<script>

    $("#x").click(function () {
        $.ajax({
            url: '/giveMeAllUsers',
            type: 'GET',
            contentType: 'application/json',
            success: function (result) {
                console.log(result);
            },
            error: function (err) {
                console.log(err)
            }
        })
    })
    



</script>

</body>
</html>
