package com.ckdh.cdpp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("test", "안녕하세요");

        return "index";
    }
    
}
