<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/05/03
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    // 로그인 여부 확인하기
    // 로그인이 되어있으면
    // board.jsp 지금 내용 보여줌
    // 로그인이 안 되어있으면
    // login.jsp로 forward?
    // redirect인듯..
    String id = request.getParameter("id");
//    String pwd = request.getParameter("pwd");
//    System.out.println("session 있는지 확인용 "+session);
    String sessionId = (String) session.getAttribute("id");
    System.out.println("sessionID 확인 : "+sessionId);
    // 로그인이 안되어있으면
    if (sessionId == null) {
        response.sendRedirect("/login.jsp");
    }
%>



<html>
<head>
    <title>Board</title>
</head>
<body>
<%--top내비게이션 메뉴 공통 부분--%>
<jsp:include page="topNav.jsp" flush="false"/>

<div style="padding-left:16px">
    <h1> Board.jsp </h1>
    <h2> --게시판-- </h2>
</div>
</body>
</html>
