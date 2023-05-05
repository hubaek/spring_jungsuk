<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/05/04
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String loginYN = "Login";
    String url = "/login.jsp";
    String sessionId = (String) session.getAttribute("id");
    // sessionId가 존재하면 Login -> Logout으로 변경.
    if (sessionId != null){
        loginYN = "Logout";
        url = "/logout";
    }
%>
<html>
<head>
    <title>TopNav</title>
  <link rel="stylesheet" type="text/css" href="/topNav.css">

</head>
<body>
<%--네비게이션 HOME , BOARD , LOGIN 버튼을 만든다.
Home - index.jsp
Board - board.jsp
Login - login.jsp 경로 지정
--%>
<%-- 공통 내비게이션 --%>
<div class="topnav">
  <a class="active" href="index.jsp">Home</a>
  <a href="board.jsp">Board</a>
  <a href="<%=url%>" id="asd"><%=loginYN%></a>
</div>
</body>
</html>
