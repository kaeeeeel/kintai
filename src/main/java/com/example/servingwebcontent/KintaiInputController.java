package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KintaiInputController{
    @RequestMapping("/kintai_input")
    String home(Model model){
        return "kintai_input";
    }
}
