package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class LoginServlet4 {
    @RequestMapping("/login4")
    public String login(HttpServletRequest request, HttpServletResponse response,
                       String id, String rememberId)
            throws IOException{

        // login.jsp로 부터 id와 pw를 받아온다.
        // 1. 입력
//        System.out.println("checkbox 값 확인 :  " + rememberId);
//        System.out.println("before 값 확인 : " + before);
        String referer = request.getHeader("referer");
        String before = request.getParameter("before"); // toURL값
//        System.out.println("Controller referer 확인 : " + referer);

        // 2. 처리
        if (id != null) {   // id가존재하면 = 로그인이 되었으면
            HttpSession session = request.getSession(); // 세션을 가져옴
            session.setAttribute("id", "asdf");
            // 1. rememberID 체크 되어있을때 - 쿠키생성
            // 2. rememberID 체크해제 - 쿠키가 있으면 쿠키삭제
            if (rememberId != null) {
                Cookie cookie = new Cookie("id", "asdf");
                cookie.setMaxAge(60 * 60 * 24); // 유효기간 설정(초)
                response.addCookie(cookie); // 응답에 쿠키 추가
                System.out.println("쿠키 생성여부 " + cookie);
            } else {
                if (id.equals("asdf")) {
                    Cookie cookie1 = new Cookie("id", "asdf");   // 쿠키삭제과정
                    cookie1.setMaxAge(0);
                    response.addCookie(cookie1);
                    System.out.println("ID기억 체크 안함 ! 쿠키삭제.");
                }
            }
            // index에서 Board클릭 - board.jsp / login클릭 - index.jsp
            // 로그인 되었을 때 페이지 넘겨주는 조건문
            if (before.equals("null") || before.equals("")) {
//                response.sendRedirect("/");
                System.out.println("if문 작성");
                return "redirect:/";    // 인덱스로 감
            } else {
//                response.sendRedirect(referer);
                System.out.println("redirect ==>"+before);
                return "redirect:"+before;
            }
        } else {    // 로그인이 안되었을때
            // redirect
//            response.sendRedirect("/login.jsp");
            System.out.println("로그인안되어있음!! + "+before);
            return "redirect:/login.jsp?toURL="+before;
        }

        }
        @RequestMapping("/logout")
        public String logout (HttpServletRequest request) {
            HttpSession session = request.getSession();
            session.invalidate();   // 로그아웃 버튼을 누르면 세션 종료
//        response.sendRedirect("/index.jsp");
            return "redirect:/index.jsp";
        }

    }

