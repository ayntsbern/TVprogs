package com.tvprog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getIndex(){
        return "/index.jsp";
    }

    @RequestMapping("/welcome")
    public String getWelcome(){
        return "channel";
    }
}