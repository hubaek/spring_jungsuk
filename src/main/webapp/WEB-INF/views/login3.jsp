<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/05/02
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String cookieId = "";

// 쿠키를 읽어온다.
  Cookie[] cookies = request.getCookies();
  for (Cookie cookie : cookies) {
    String name = cookie.getName();
    String value = cookie.getValue();
    if ("id".equals(name)) {  // "id"가 쿠키에서 가져온 이름과 같으면
      cookieId = value; // cookieId는 쿠키name이 "id"인 value값이 대입
      // 체크박스가 checked되어있어야함
      System.out.println("쿠키값 읽어온거 확인 : "+cookieId);
    } else {
      cookieId = "";
    }
  }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1></h1>
  <form action="/login3" method="post">
    <label for="id">ID : </label>
    <input type="text" id="id" name="id" value="<%=cookieId%>"><br><br>

    <label for="pwd">password : </label>
    <input type="password" id="pwd" name="pwd"><br><br>

    <input type="checkbox" id="rememberId" name="rememberId"  ${cookie.id.value != null ? "checked":" "}>
    <label for="rememberId">ID 기억하기</label><br>

    <input type="submit" value="로그인"><br>
  </form>
</body>
</html>
