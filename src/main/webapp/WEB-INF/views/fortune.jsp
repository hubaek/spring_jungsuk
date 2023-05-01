<%--
  Created by IntelliJ IDEA.
  User: hubaek
  Date: 2023/04/28
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
    form{
        border: 1px solid black;
    }
</style>
<html>
<head>
    <title>운세보기</title>
</head>
<body>
    <h1>오늘의 운세를 한번 봐 보세요~</h1>
    <form action="/fortune/result" method="post">

        <%--@declare id="option1"--%>
        <%--@declare id="option2"--%>
        <%--@declare id="birth"--%>
        <%--@declare id="gender"--%><br>

        <label for="name">이름 : </label>
        <input type="text" id="name" name="name"><br><br>

        <label for="gender">성별 : </label>
        <input type="radio" id="gender" name="gender" value="남성">
        <label for="option1">남</label>
        <input type="radio" id="gender" name="gender" value="여성">
        <label for="option2">여</label><br><br>

<%--        <label for="birth">생일 : </label>--%>
<%--        <input type="number" id="year" name="year" min="1900" max="2099">--%>
<%--        <label for="year">년</label>--%>

<%--        <input type="number" id="month" name="month" min="1" max="12">--%>
<%--        <label for="month">월</label>--%>

<%--        <input type="number" id="day" name="day" min="1" max="31">--%>
<%--        <label for="day">일</label><br><br>--%>

        <label for="birth">생일 : </label>
        <select id="year" name="year">
        </select>
        <label for="year">년</label>

        <select id="month" name="month">
        </select>
        <label for="month">월</label>

        <select id="day" name="day">
        </select>
        <label for="day">일</label>
        <br><br>

        <input type="submit" value="운세보기">
        <br><br>
    </form>

    <script>
        year = document.getElementById("year");
        for(let i=1980; i<=2023 ; i++){
            options = document.createElement("option");
            options.value = i;
            options.text = i;
            year.add(options);
        }
        month = document.getElementById("month");
        for(let i=1; i<=12 ; i++){
            options = document.createElement("option");
            options.value = i;
            options.text = i;
            month.add(options);
        }
        day = document.getElementById("day");
        for(let i=1; i<=31 ; i++){
            options = document.createElement("option");
            options.value = i;
            options.text = i;
            day.add(options);
        }
    </script>
</body>
</html>
