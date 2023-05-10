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

    String referer = request.getHeader("referer");
    String toURL = request.getParameter("toURL");
    System.out.println("login.jsp에서 referer 확인 : "+referer);
    System.out.println("login.jsp에서 toURL 확인 : "+toURL);
    // index에서 로그인을 눌러서 로그인하면 Index로 와야하는데 login.jsp로 감 - controller referer가 login.jsp로
    // index에서 board눌러서 로그인해도 login.jsp로 감.
//    System.out.println("toURL 확인 : " + toURL);

    String cookieID = "";
    // 쿠키를 읽어온다.


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
    <input type="text" id="id" name="id" value="<%=cookieID%>"><br><br>
<%--<%=cookieId%>--%>
    <label for="pwd">password : </label>
    <input type="password" id="pwd" name="pwd"><br><br>

    <input type="checkbox" id="rememberId" name="rememberId" ${cookie.id.value != null ? "checked":" "}>
<%--${cookie.id.value != null ? "checked":" "--%>
    <label for="rememberId">ID 기억하기</label><br>

    <input type="submit" value="로그인"><br>
<%--        <input type = "hidden" name="before" value= "${param.toURL}" >--%>
        <input type = "text" name="before" value= "<%=toURL%>">
<%--        <input type = "text" name="before" value= "<%=referindex%>">--%>
</form>
</div>

</body>
</html>
