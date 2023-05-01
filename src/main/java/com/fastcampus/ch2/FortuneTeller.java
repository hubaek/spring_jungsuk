package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class FortuneTeller {
    @RequestMapping("/fortune")
    public String Fortune() {
        // 1. 입력

        // 2. 처리

        // 3. 출력
        return "fortune";
    }
    @RequestMapping("/fortune/result")
    public String FortuneResult(String name, String gender, int year, int month, int day,
                                Model model) {
        // 1. 입력
        // fortune.jsp의 form태그에서 전송된 값들을 메서드의 매개변수 값으로 받아옴

        // 2. 처리
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
        sdf.format(today);

        // 3. model에 저장
        model.addAttribute("name",name);
        model.addAttribute("gender",gender);
        model.addAttribute("birthYear",year);
        model.addAttribute("birthMonth",month);
        model.addAttribute("day",day);
        model.addAttribute("today",sdf.format(today));
        return "fortuneResult";
    }
}
