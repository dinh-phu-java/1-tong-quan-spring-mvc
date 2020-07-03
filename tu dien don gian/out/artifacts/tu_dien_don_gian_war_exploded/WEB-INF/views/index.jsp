<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 7/3/2020
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="home" method="post">
    <label >Tu tieng anh</label>
    <input type="text" name="english">
    <button>Translate</button>
  </form>
  <p>Result: ${result}</p>
  </body>
</html>
