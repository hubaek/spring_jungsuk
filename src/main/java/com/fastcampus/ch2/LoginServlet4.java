package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
        String rememberId = request.getParameter("rememberId");
        System.out.println("checkbox 값 확인 :  " +rememberId);

        // 2. 처리
        if (id != null) {   // id가존재하면 = 로그인이 되었으면
            HttpSession session = request.getSession(); // 세션을 가져옴
            session.setAttribute("id","asdf");
            System.out.println("session Get ID : "+session.getAttribute("id"));
            // session.getAttribute : "asdf"
            // 1. rememberID 체크 되어있을때 - 쿠키생성
            // 2. rememberID 체크해제 - 쿠키가 있으면 쿠키삭제
            if (rememberId != null) {
                Cookie cookie = new Cookie("id","asdf");
                cookie.setMaxAge(60 * 60 * 24); // 유효기간 설정(초)
                response.addCookie(cookie); // 응답에 쿠키 추가
                System.out.println("쿠키 생성여부 " + cookie);
            } else if (rememberId == null) {
                Cookie[] cookies = request.getCookies();

                    if (id.equals("asdf")) {
                        Cookie cookie1 = new Cookie("id", "asdf");   // 쿠키삭제과정
                        cookie1.setMaxAge(0);
                        response.addCookie(cookie1);
                        System.out.println("쿠키삭제.");
                    }
            }
            // board를 클릭하면 board.jsp에서 forward해서 board.jsp주소가 login.jsp타고
            // 컨트롤러로 넘어오니깐 redirect로 보내주면 되는데
            // login으로 바로 왔을땐 redirect는 login페이지로 넘어가야한다.
            String referer = request.getHeader("referer");
            System.out.println("Controller referer 확인 : "+referer);
            // 로그인 되었을 때 페이지 넘겨주는 조건문
            if (referer==null || referer.equals("")) {
                response.sendRedirect("/");
            } else {
                response.sendRedirect(referer); // board 눌러서 들어오면
            }
        } else {    // 로그인이 안되었을때
            // redirect
            response.sendRedirect("/login.jsp");
        }

    }
    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();   // 로그아웃 버튼을 누르면 세션 종료
        response.sendRedirect("/index.jsp");
    }

}
