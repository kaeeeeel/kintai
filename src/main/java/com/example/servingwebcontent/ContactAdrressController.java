package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactAdrressController  {
    @RequestMapping("/contact_address")
    String home(Model model){
        return "contact_address";
    }
}

