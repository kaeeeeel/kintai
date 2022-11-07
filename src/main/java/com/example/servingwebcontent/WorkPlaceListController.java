package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkPlaceListController  {
    @RequestMapping("/workplace_list")
    String home(Model model){
        return "workplace_list";
    }
}
