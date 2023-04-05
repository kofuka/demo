package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainContoller {

        @GetMapping("/home")
        public String greeting(Model model){
            model.addAttribute("title", "Main Page");
            return "home";


    }

}
