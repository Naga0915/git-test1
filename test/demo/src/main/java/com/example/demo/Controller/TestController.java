package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "guest") String param, Model model) {
        model.addAttribute("name", param);
        return "index";
    }
    
}
