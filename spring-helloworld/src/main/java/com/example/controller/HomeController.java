package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/hello")
    public String hello() {
        //return jsp的文件名就可以跳转到对应的jsp
        return "hello";
    }
}
