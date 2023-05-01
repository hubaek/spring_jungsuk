<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/04/28
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>오늘의 운세</title>
</head>
<body>
<%--    <h1> ${name}님은 ${gender}, 생년월일은 ${year}년 ${month}월 ${day}일 입니다.</h1>--%>
    <h1> ${name}님의 오늘의 운세는?? </h1>
    <div>

        <h2>${today}</h2><br>
        <h3>${name}(${gender}, ${birthYear}.${birthMonth}.${day})님의 오늘의 운세</h3><br>
        04월 28일의 운세 총운은 “노마지지” 입니다.<br>
        당신을 시기하고 질투하던 이가 극적인 사건을 계기로 당신을 돕게 됩니다.<br>
        당신에 대한 쓸데없는 소문과 오해가 가라앉는 순간입니다.<br>
        지금까지 당신이 고통받고 스트레스 받았던 그 순간들을 모두 보상받을 정도로 당신의 마음이 위안을 받을 수 있습니다.<br>
        당신의 노력을 알아주는 날이기도 하며 사람들과의 관계도 발전적인 방향으로 나아가네요.<br>
        또한 마음이 편해지니 더욱 힘을 내서 일에 매달릴 수 있습니다.<br>
        그 어느 때보다도 당신의 마음이 편안해지는 날이군요.<br>
        그 기분을 만끽하세요.<br>


    </div>
</body>
</html>
