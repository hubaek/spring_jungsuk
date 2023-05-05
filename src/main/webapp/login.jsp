<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/05/03
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
//    String referer = request.getHeader("referer"); // login.jsp에선 referer확인 어려움
//    System.out.println("login.jsp에서 referer 확인 : "+referer);
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%--top내비게이션 메뉴 공통 부분--%>
<jsp:include page="topNav.jsp" flush="false"/>

<div style="padding-left:16px">
    <br><br>
<%--로그인 폼. ID 기억하기(쿠키?)--%>
<form action="/login4" method="post">
    <label for="id">ID : </label>
    <input type="text" id="id" name="id" value=""><br><br>
<%--<%=cookieId%>--%>
    <label for="pwd">password : </label>
    <input type="password" id="pwd" name="pwd"><br><br>

    <input type="checkbox" id="rememberId" name="rememberId" }>
<%--${cookie.id.value != null ? "checked":" "--%>
    <label for="rememberId">ID 기억하기</label><br>

    <input type="submit" value="로그인"><br>
</form>
</div>

</body>
</html>
