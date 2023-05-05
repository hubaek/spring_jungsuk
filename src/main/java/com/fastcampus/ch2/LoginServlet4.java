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

        // 2. 처리
        // session이 어떻게 작동하는 걸까??
        // 일단. 서버를 킬때마다 쿠키를 보면 JSESSIONID가 기본있고
        // Value만 계속 바뀐다.

        // id와 pwd가 일치하면
        // xxx forward - board.jsp xxx
        // login버튼으로 왔으면 index / board버튼 - board
        // 일치하지않으면
        // redirect - login.jsp
        String referer = request.getHeader("referer");
        System.out.println("Controller referer 확인 : "+referer);

        if (id != null) {   // id가존재하면 = 로그인이 되었으면
            HttpSession session = request.getSession(); // 세션을 가져옴
            session.setAttribute("id","asdf");
            System.out.println("session Get ID : "+session.getAttribute("id"));
            // session.getAttribute : "asdf"

            // board를 클릭해서 login했으면 board.jsp로 가고
            // login을 클릭해서 login해서 데이터가 넘어오면 index.jsp로 가야함
            // 근데.. board에서 넘어왔는지 login에서 넘어왔는지 어떻게 확인해야하지..?
            // referer 활용..
            // referer을 어떻게 활용할까?
//            RequestDispatcher dispatcher = request.getRequestDispatcher(referer);
//            dispatcher.forward(request, response);
            // board를 클릭하면 board.jsp에서 forward해서 board.jsp주소가 login.jsp타고
            // 컨트롤러로 넘어오니깐 redirect로 보내주면 되는데
            // login으로 바로 왔을땐 redirect는 login페이지로 넘어가야한다.
            if (referer.equals("http://localhost:8080/board.jsp")){
                response.sendRedirect(referer); // board 눌러서 들어오면
            } else {
//                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
//                dispatcher.forward(request, response);
                response.sendRedirect("/index.jsp");
            }
        } else {
            // redirect
            response.sendRedirect("/login.jsp");
        }

    }
    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("/index.jsp");
    }

}
