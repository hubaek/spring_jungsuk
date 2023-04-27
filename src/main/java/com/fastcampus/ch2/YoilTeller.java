package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
public class YoilTeller {
    @RequestMapping("/getYoils")
    public void main(int year, int month, int day,
                     HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 1. 입력 - main메서드 매개변수 -> String year, String month, String day 적으면 안 적어줘도 됨.
        // 입력은 request.getParemeter로 단순하기 때문에 간략하게 생략 가능
//        String year = request.getParameter("year");
//        String month = request.getParameter("month");
//        String day = request.getParameter("day");
        // main 메서드 매개변수를 String->int로 바꿔주면 스프링이 알아서 값을 읽고 변환(parseInt)해줌
//        int yyyy = Integer.parseInt(year);
//        int mm = Integer.parseInt(month);
//        int dd = Integer.parseInt(day);

        // 2. 처리
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        // 3. 출력
        response.setContentType("text/html");   // 응답의 형식을 html로 지정
        response.setCharacterEncoding("utf-8"); // 응답의 인코딩을 utf-8로 지정
        PrintWriter out = response.getWriter(); // 브라우저로의 출력 스트림(out)을 얻는다.
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println(year + "년 " + month + "월 " + day + "일은 ");
        out.println(yoil + "요일입니다.");
        out.println("</body>");
        out.println("</html>");
    }
}
