package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    private String showHome(){
        return "home";
    }

    @GetMapping("/leaders")
    private String showLeaders(){
        return "leaders";
    }

    @GetMapping("/systems")
    private String showSystems(){
        return "systems";
    }
}
