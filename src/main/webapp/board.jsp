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
    String referer = request.getHeader("referer");
    System.out.println("board.jsp에서 referer 확인 : "+referer);
    // 로그인 여부 확인하기(세션)
    // ==> 로그인이 안되어 있으면 redirect(login.jsp)만 조건 걸면
    // 로그인 되어 있으면 자동으로 board.jsp를 보여주게 된다. 굳이 로그인 되어있으면 조건문 고민 x
//    String id = request.getParameter("id");
    // session은 기본 구현. LoginServlet에서 get했으므로 jsp 공통 접근
    String sessionId = (String) session.getAttribute("id");
    System.out.println("sessionID 확인 : "+sessionId);
    // 로그인이 안되어있으면
    if (sessionId == null) {
//        response.sendRedirect("/login4");  // redirect이면 요청을 끊고 다시 index에서 login.jsp로 요청보내는 것
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login4");
        dispatcher.forward(request, response);
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
