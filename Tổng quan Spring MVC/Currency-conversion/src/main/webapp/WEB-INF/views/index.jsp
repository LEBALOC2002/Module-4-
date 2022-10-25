<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/25/2022
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Conversion</title>
</head>
<body>
<form action="/usd" method = "post">
    <label for="usd">USD: </label>
    <input type="number" id="usd" step="any" min = "1" name = "usd"/>
    <input type = "submit" value="Conversion"/>
</form>
</body>
</html>
