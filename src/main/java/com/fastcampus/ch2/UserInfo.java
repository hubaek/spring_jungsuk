package com.fastcampus.ch2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login2/result")
public class UserInfo extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        // 1. 입력
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        // 2. 처리
        // 3. 출력
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3> forward : /login2/result (UserInfo.java) </h3>");
        out.println("<h1> 로그인 완료 </h1>");
        out.println("ID : "+ id +"<br>");
        out.println("PassWord :" + pwd);
        out.println("</body>");
        out.println("</html>");
    }
}
