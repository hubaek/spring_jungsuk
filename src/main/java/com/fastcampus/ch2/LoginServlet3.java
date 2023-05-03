package com.fastcampus.ch2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        // 1. 입력
        // 2. 처리
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/login3.jsp");
        dispatcher.forward(request, response);
        // 3. 출력
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        // 1. 입력
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String rememberId = request.getParameter("rememberId");
        System.out.println("checkbox 값 확인 :  " +rememberId);
        // 2. 처리
        if (rememberId != null) {  // id기억하기 버튼 클릭하면 쿠키생성
            Cookie cookie = new Cookie("id","asdf"); // 쿠키생성
            cookie.setMaxAge(60*60*24); // 유효기간 설정(초)
            response.addCookie(cookie); // 응답에 쿠키 추가
            System.out.println("쿠키 생성여부 " + cookie);
        } else if (rememberId == null) {
            Cookie cookie = new Cookie("id", "asdf");   // 쿠키삭제과정
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            System.out.println("쿠키삭제.");
        }
//        System.out.println("request넘어오는지 확인" + id + pwd);




        // cookieId - 입력한 id값
        // jsp에서 form태그 ID기억하기를 체크하면 - 조건문?
        // 쿠키ID값이 form태그의 id값에 디폴트로 넣어져야한다?
        // 여기서 jsp파일에 변화를 줄 수가 있나?

//        Cookie[] cookies = request.getCookies();    // 쿠키읽기
//        for (Cookie cookie1 : cookies) {
//            String name = cookie1.getName();
//            String value = cookie1.getValue();
////            System.out.printf("[cookie]name = %s, value = %s%n", name, value);
//            if ("id".equals(name)){
//                String cookieId = value;
//                System.out.println(cookieId);
//            }
//        }
        // 3. 출력
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
//        out.println("<h3> login3.jsp - POST -> LoginServlet3  </h3>");
        out.println("<h1> 로그인 완료 </h1>");
        out.println("ID : "+ id +"<br>");
        out.println("PassWord :" + pwd);
        out.println("</body>");
        out.println("</html>");
    }
}
