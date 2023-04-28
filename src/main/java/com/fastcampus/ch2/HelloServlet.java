package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Math.random;

@Controller
public class HelloServlet {
    @RequestMapping("/rolldice2")
    public void DiceServlet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // 1. 입력

        // 2. 처리
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
        // 3. 출력
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src='../resources/img/dice"+num1+".png'>");
        out.println("<img src='../resources/img/dice"+num2+".png'>");
        out.println("</body>");
        out.println("</html>");
    }
}
