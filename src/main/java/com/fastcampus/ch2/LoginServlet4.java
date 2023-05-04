package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginServlet4 {
    @RequestMapping("/login4")
    public void main(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // login.jsp로 부터 id와 pw를 받아온다.

        // 1. 입력
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        // 2. 처리
        // session이 어떻게 작동하는 걸까??
        // 일단. 서버를 킬때마다 쿠키를 보면 JSESSIONID가 기본있고
        // Value만 계속 바뀐다.
//        HttpSession session = request.getSession();
////        System.out.println("SesstionID : " + session.getId());
//        session.setAttribute("id","asdf");
//
//        System.out.println("session Get ID : "+session.getAttribute("id"));
//        // session.getAttribute : "asdf"

        // id와 pwd가 일치하면
        // forward - board.jsp
        // 일치하지않으면
        // redirect - login.js인
        if (id != null) {
            // session이 어떻게 작동하는 걸까??
            // 일단. 서버를 킬때마다 쿠키를 보면 JSESSIONID가 기본있고
            // Value만 계속 바뀐다.
            HttpSession session = request.getSession();
            session.setAttribute("id","asdf");
            System.out.println("session Get ID : "+session.getAttribute("id"));
            // session.getAttribute : "asdf"
            RequestDispatcher dispatcher = request.getRequestDispatcher("/board.jsp");
            dispatcher.forward(request, response);
        } else {
            // redirect
            response.sendRedirect("/login.jsp");
        }

    }
}
