package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
//import static java.util.Formatter.Conversion.isValid;

@Controller
public class YoilController {
    @RequestMapping(value = "/getYoil", method = RequestMethod.GET)
    public ModelAndView main(int year, int month, int day) {
        // 1. ModelAndView를 생성
        ModelAndView mv = new ModelAndView();

        // 2. 처리
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        // 3. ModelAndView에 작업 결과 저장
        mv.addObject("year", year);
        mv.addObject("month", month);
        mv.addObject("day", day);
        mv.addObject("yoil", yoil);

        // 4. 작업 결과를 보여줄 View의 이름을 반환
        mv.setViewName("yoil");

        // 5. ModelAndView를 반환
        return mv;  // /WEB-INF/views/yoil.jsp
    }
}
