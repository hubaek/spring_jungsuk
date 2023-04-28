package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloServletMVC {
    @RequestMapping("/rolldice")
    public String Dice(HttpServletRequest request, HttpServletResponse response,
                       Model model) throws IOException {
        // 2. 처리
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "dice";
    }
}
