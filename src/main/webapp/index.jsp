<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/05/03
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>index</title>
<%--    <link rel="stylesheet" type="text/css" href="/index.css">--%>

</head>
<body>
<%--네비게이션 HOME , BOARD , LOGIN 버튼을 만든다.
Home - index.jsp
Board - board.jsp
Login - login.jsp 경로 지정
--%>
<%-- 공통 내비게이션
<div class="topnav">
    <a class="active" href="index.jsp">Home</a>
    <a href="board.jsp">Board</a>
    <a href="#contact">Contact</a>
    <form action="login4" method="post">
        <input type="submit" value="Login">
    </form>
    <a href="login.jsp" id="login">Login</a>
</div>
--%>
<jsp:include page="topNav.jsp" flush="false"/>

<div style="padding-left:16px">
    <h2> 게시판 홈 </h2>
    <p>홈, 게시판, 로그인 구현하기</p>
</div>
</body>
</html>
