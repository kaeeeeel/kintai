package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController  {
    @RequestMapping("/login")
    String home(Model model){
        return "login";
    }
}
