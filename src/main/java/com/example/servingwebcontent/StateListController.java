package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StateListController  {
    @RequestMapping("/state_list")
    String home(Model model){
        return "state_list";
    }
}
