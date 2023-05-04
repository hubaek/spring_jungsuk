<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/05/04
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>TopNav</title>
  <link rel="stylesheet" type="text/css" href="/topNav.css">

</head>
<body>
<%-- 공통 내비게이션 --%>
<div class="topnav">
  <a class="active" href="index.jsp">Home</a>
  <a href="board.jsp">Board</a>
  <form action="login4" method="post" id="login">
    <input type="submit" value="Login" class="input">
  </form>
<%--  <a href="login.jsp" id="login">Login</a>--%>
</div>
</body>
</html>
