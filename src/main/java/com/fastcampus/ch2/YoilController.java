package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
//import static java.util.Formatter.Conversion.isValid;

@Controller
public class YoilController {
    @RequestMapping(value = "/getYoil", method = RequestMethod.GET)
    public String main(int year, int month, int day, Model model) {
//        // 1. 유효성 검사
//        if (!isValid(year, month, day))
//            return "yoilError"; // 유효하지 않으면, /WEB-INF/views/yoilError.jsp로 이동
//    }
        // 2. 처리
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        // 3. Model에 작업 결과 저장
        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("yoil", yoil);

        // 4. 작업 결과를 보여줄 View의 이름을 반환
        return "yoil";  // /WEB-INF/views/yoil.jsp
    }
}
