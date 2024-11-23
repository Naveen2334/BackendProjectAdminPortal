package com.example.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppliactionController {
     @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/widgets")
    public String widgets() {
        return "widgets";
    }
    @GetMapping("/layout")
    public String layout() {
        return "layout";
    }
}
