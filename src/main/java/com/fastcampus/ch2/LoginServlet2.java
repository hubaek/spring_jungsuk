package com.fastcampus.ch2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // 1. 입력 - login2.html - id, pwd
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        // 2. 처리
        // id와 pw가 일치하는지 확인한다.
        // 일치하면 UserInfo.java(login2/result)로 forward
        // 일치하지않으면 login2.html로 redirect
        // if문으로 처리
//        RequestDispatcher dispatcher = request.getRequestDispatcher("login2/result");
//        dispatcher.forward(request, response);
        if (id.equals("asdf") && pwd.equals("1234")) {
            // forward
            RequestDispatcher dispatcher = request.getRequestDispatcher("login2/result");
            dispatcher.forward(request, response);
        } else {
            // redirect
            response.sendRedirect("/login2.html");
        }

        // 3. 출력
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

    }
}
