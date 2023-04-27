package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

// 서블릿을 새로 만드는 중입니다.
// 원격 프로그램으로 만들려면
// 1. 등록
// 2. 연결
@WebServlet("/hello")   // 역할 : 등록과 연결을 동시에 해줌
public class Hello extends HttpServlet {
    // public static void main(String[] args) 원래 main의 자리에 service가 들어가는것뿐
    // main 메서드랑 다를게 없다.
    // java Hello abc 123 하면 main의 args에 abc,123 문자열이 들어가서 abc123이 되듯이
    // URL : http://local/web/hello -> service의 request 객체에 요청정보(url)이 들어감
    // request : 요청정보 , response : 응답정보가 들어가 있음
    public void service(ServletRequest request, ServletResponse response) throws IOException {

        // 1. 입력
        // http://localhost:8080/hello?name=Baek
        String name = request.getParameter("name");

        // 2. 작업

        // 3. 출력
        //        System.out.println("Hello");  // 서버의 콘솔에 출력
        PrintWriter out = response.getWriter();
//        out.println("Hello");   // 브라우저에 출력
        out.println("<html>");   // 브라우저에 출력
        out.println("<head>");   // 브라우저에 출력
        out.println("</head>");   // 브라우저에 출력
        out.println("<body>");   // 브라우저에 출력
        out.println("<h1>hello," + name + "</h1>");   // 브라우저에 출력
        out.println("</body>");   // 브라우저에 출력
        out.println("</html>");   // 이거는 좀 복잡, 말이 x
    }
}
