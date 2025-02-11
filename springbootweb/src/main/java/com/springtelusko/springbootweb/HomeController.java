package com.springtelusko.springbootweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Don't add .jsp extension
    }

    @GetMapping("/add")
    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2,Model model){
        int sum=num1+num2;
        model.addAttribute("result", sum);
        return "result";
    }
}
